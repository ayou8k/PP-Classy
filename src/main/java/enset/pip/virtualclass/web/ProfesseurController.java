package enset.pip.virtualclass.web;

import enset.pip.virtualclass.dao.ProfesseurRepository;
import enset.pip.virtualclass.entities.Professeur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ProfesseurController {
    @Autowired
    private ProfesseurRepository professeurRepository;
    @GetMapping(value = "/listProfesseurs")
    public List<Professeur> listProfesseurs()
    {
        return professeurRepository.findAll();
    }

    @GetMapping(value = "listProfesseurs/{id}")
    public Professeur listProfesseurs(@PathVariable(name="id") Long id)
    {
        return professeurRepository.findById(id).orElse(null);
    }
    @PutMapping(value = "listProfesseurs/{id}")
    public Professeur Update(@PathVariable(name="id") Long id, @RequestBody Professeur e)
    {
        e.setId(id);
        return professeurRepository.save(e);
    }
    @PostMapping(value = "listProfesseurs/")
    public Professeur save(@RequestBody Professeur e)
    {
        return professeurRepository.save(e);
    }
    @DeleteMapping(value = "listProfesseurs/{id}")
    public void delete(@PathVariable(name="id") Long id)
    {
        professeurRepository.deleteById(id);
    }

}
