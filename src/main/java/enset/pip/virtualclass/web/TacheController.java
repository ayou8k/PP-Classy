package enset.pip.virtualclass.web;

import enset.pip.virtualclass.dao.TacheRepository;
import enset.pip.virtualclass.entities.Tache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class TacheController {
    @Autowired
    private TacheRepository tacheRepository;

    @GetMapping(value = "/listTaches")
    public List<Tache> listTaches() {
        return tacheRepository.findAll();
    }

    @GetMapping(value = "GetTache/{id}")
    public Tache listTaches(@PathVariable(name = "id") Long id) {
        return tacheRepository.findById(id).orElse(null);
    }

    @PutMapping(value = "UpdateTache/{id}")
    public Tache Update(@PathVariable(name = "id") Long id, @RequestBody Tache e) {
        e.setId_Tache(id);
        return tacheRepository.save(e);
    }

    @PostMapping(value = "CreateTache/")
    public Tache save(@RequestBody Tache e) {
        return tacheRepository.save(e);
    }

    @DeleteMapping(value = "DeleteTache/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        tacheRepository.deleteById(id);
    }
}
