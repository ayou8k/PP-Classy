package enset.pip.virtualclass.web;

import enset.pip.virtualclass.dao.ClasseRepository;
import enset.pip.virtualclass.entities.Classe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ClasseController {
    @Autowired
    private ClasseRepository classeRepository;

    @GetMapping(value = "/listClasses")
    public List<Classe> listClasse() {
        return classeRepository.findAll();
    }

    @GetMapping(value = "GetClasse/{id}")
    public Classe listClasse(@PathVariable(name = "id") Long id) {
        return classeRepository.findById(id).orElse(null);
    }

    @PutMapping(value = "UpdateClasse/{id}")
    public Classe Update(@PathVariable(name = "id") Long id, @RequestBody Classe e) {
        e.setId(id);
        return classeRepository.save(e);
    }

    @PostMapping(value = "CreateClasse/")
    public Classe save(@RequestBody Classe e) {
        return classeRepository.save(e);
    }

    @DeleteMapping(value = "DeleteClasse/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        classeRepository.deleteById(id);
    }
}
