package enset.pip.virtualclass.web;

import enset.pip.virtualclass.dao.CategorieRepository;
import enset.pip.virtualclass.entities.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategorieController {
    @Autowired

    private CategorieRepository categorieRepository;

    @GetMapping(value = "/listCategories")
    public List<Categorie> listCategorie() {
        return categorieRepository.findAll();
    }

    @GetMapping(value = "GetCategorie/{id}")
    public Categorie listCategorie(@PathVariable(name = "id") Long id) {
        return categorieRepository.findById(id).orElse(null);
    }

    @PutMapping(value = "UpdateCategorie/{id}")
    public Categorie Update(@PathVariable(name = "id") Long id, @RequestBody Categorie e) {
        e.setId(id);
        return categorieRepository.save(e);
    }

    @PostMapping(value = "CreateCategorie/")
    public Categorie save(@RequestBody Categorie e) {
        return categorieRepository.save(e);
    }

    @DeleteMapping(value = "DeleteCategorie/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        categorieRepository.deleteById(id);
    }
}
