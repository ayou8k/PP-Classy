package enset.pip.virtualclass.web;

import enset.pip.virtualclass.dao.Publication_ProjetRepository;
import enset.pip.virtualclass.entities.Publication_Projet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class Publication_ProjetController {
    @Autowired
    private Publication_ProjetRepository publication_ProjetRepository;
    @GetMapping(value = "/listPublication_Projets")
    public List<Publication_Projet> listPublication_Projets()
    {
        return publication_ProjetRepository.findAll();
    }

    @GetMapping(value = "listPublication_Projets/{id}")
    public Publication_Projet listPublication_Projets(@PathVariable(name="id") Long id)
    {
        return publication_ProjetRepository.findById(id).orElse(null);
    }
    @PutMapping(value = "listPublication_Projets/{id}")
    public Publication_Projet Update(@PathVariable(name="id") Long id, @RequestBody Publication_Projet e)
    {
        e.setId(id);
        return publication_ProjetRepository.save(e);
    }
    @PostMapping(value = "listPublication_Projets/")
    public Publication_Projet save(@RequestBody Publication_Projet e)
    {
        return publication_ProjetRepository.save(e);
    }
    @DeleteMapping(value = "listPublication_Projets/{id}")
    public void delete(@PathVariable(name="id") Long id)
    {
        publication_ProjetRepository.deleteById(id);
    }
}
