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
    public List<Groupe> listGroupes()
    {
        return groupeRepository.findAll();
    }

    @GetMapping(value = "listGroupes/{id}")
    public Groupe listGroupes(@PathVariable(name="id") Long id)
    {
        return groupeRepository.findById(id).orElse(null);
    }
    @PutMapping(value = "listGroupes/{id}")
    public Groupe Update(@PathVariable(name="id") Long id, @RequestBody Groupe e)
    {
        e.setId(id);
        return groupeRepository.save(e);
    }
    @PostMapping(value = "listGroupes/")
    public Groupe save(@RequestBody Groupe e)
    {
        return groupeRepository.save(e);
    }
    @DeleteMapping(value = "listGroupes/{id}")
    public void delete(@PathVariable(name="id") Long id)
    {
        groupeRepository.deleteById(id);
    }
}
