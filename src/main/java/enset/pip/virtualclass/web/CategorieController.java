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
    public List<Categorie> listCategories() {
        return categorieRepository.findAll();
    }

    @GetMapping(value = "listCategories/{id}")
    public Categorie listCategories(@PathVariable(name = "id") Long id) {
        return categorieRepository.findById(id).orElse(null);
    }

    @PutMapping(value = "listCategories/{id}")
    public Categorie Update(@PathVariable(name = "id") Long id, @RequestBody Categorie e) {
        e.setId(id);
        return categorieRepository.save(e);
    }

    @PostMapping(value = "listCategories/")
    public Categorie save(@RequestBody Categorie e) {
        return categorieRepository.save(e);
    }

    @DeleteMapping(value = "listCategories/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        categorieRepository.deleteById(id);
    }
}
