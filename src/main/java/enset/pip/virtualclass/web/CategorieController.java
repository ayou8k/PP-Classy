package enset.pip.virtualclass.web;

import enset.pip.virtualclass.dao.CategorieRepository;
import enset.pip.virtualclass.entities.Categorie;
import enset.pip.virtualclass.exceptions.CategorieNotFoundException;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
class CategorieController {
    private final CategorieRepository categorieRepository;

    CategorieController(CategorieRepository categorieRepository){
        this.categorieRepository = categorieRepository;
    }

    @GetMapping("/categories")
    CollectionModel<EntityModel<Categorie>> all() {
        List categories = categorieRepository.findAll().stream()
                .map(categorie -> new EntityModel(categorie,
                        linkTo(methodOn(CategorieController.class).one(categorie.getId())).withSelfRel(),
                        linkTo(methodOn(CategorieController.class).all()).withRel("categories")))
                .collect(Collectors.toList());

        return new CollectionModel<>(categories,
                linkTo(methodOn(CategorieController.class).all()).withSelfRel());
    }

    @PostMapping("/categories")
    Categorie newCategorie(@RequestBody Categorie newCategorie) {
        return categorieRepository.save(newCategorie);
    }

    // Single item

    @GetMapping("/categories/{id}")
    EntityModel<Categorie> one(@PathVariable Long id) {

        Categorie categorie = categorieRepository.findById(id)
                .orElseThrow(() -> new CategorieNotFoundException(id));
        return new EntityModel<>(categorie,
                linkTo(methodOn(CategorieController.class).one(id)).withSelfRel(),
                linkTo(methodOn(CategorieController.class).all()).withRel("categories"));
    }

    @PutMapping("/categories/{id}")
    Categorie replaceCategorie(@RequestBody Categorie newCategorie, @PathVariable Long id) {

        return categorieRepository.findById(id)
                .map(categorie -> {
                    categorie.setNom(newCategorie.getNom());
                    return categorieRepository.save(categorie);
                })
                .orElseGet(() -> {
                    newCategorie.setId(id);
                    return categorieRepository.save(newCategorie);
                });
    }

    @DeleteMapping("/categories/{id}")
    void deleteCategorie(@PathVariable Long id) {
        categorieRepository.deleteById(id);
    }
}
