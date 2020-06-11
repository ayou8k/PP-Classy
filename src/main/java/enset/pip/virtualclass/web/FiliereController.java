package enset.pip.virtualclass.web;

import enset.pip.virtualclass.dao.FiliereRepository;
import enset.pip.virtualclass.entities.Filiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class FiliereController {
    @Autowired
    private FiliereRepository filiereRepository;

    @GetMapping(value = "/listFilieres")
    public List<Filiere> listFiliere() {
        return filiereRepository.findAll();
    }

    @GetMapping(value = "GetFiliere/{id}")
    public Filiere listFiliere(@PathVariable(name = "id") Long id) {
        return filiereRepository.findById(id).orElse(null);
    }

    @PutMapping(value = "UpdateFiliere/{id}")
    public Filiere Update(@PathVariable(name = "id") Long id, @RequestBody Filiere e) {
        e.setId(id);
        return filiereRepository.save(e);
    }

    @PostMapping(value = "CreateFiliere/")
    public Filiere save(@RequestBody Filiere e) {
        return filiereRepository.save(e);
    }

    @DeleteMapping(value = "DeleteFiliere/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        filiereRepository.deleteById(id);
    }
}
