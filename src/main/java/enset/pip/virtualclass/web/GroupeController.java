package enset.pip.virtualclass.web;

import enset.pip.virtualclass.dao.GroupeRepository;
import enset.pip.virtualclass.entities.Groupe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class GroupeController {
    @Autowired
    private GroupeRepository groupeRepository;

    @GetMapping(value = "/listGroupes")
    public List<Groupe> listGroupe() {
        return groupeRepository.findAll();
    }

    @GetMapping(value = "GetGroupe/{id}")
    public Groupe listGroupe(@PathVariable(name = "id") Long id) {
        return groupeRepository.findById(id).orElse(null);
    }

    @PutMapping(value = "UpdateGroupe/{id}")
    public Groupe Update(@PathVariable(name = "id") Long id, @RequestBody Groupe e) {
        e.setId(id);
        return groupeRepository.save(e);
    }

    @PostMapping(value = "CreateGroupe/")
    public Groupe save(@RequestBody Groupe e) {
        return groupeRepository.save(e);
    }

    @DeleteMapping(value = "DeleteGroupe/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        groupeRepository.deleteById(id);
    }
}
