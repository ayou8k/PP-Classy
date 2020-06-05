package enset.pip.virtualclass.web;

import enset.pip.virtualclass.dao.CompteRepository;
import enset.pip.virtualclass.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class CompteController {
    @Autowired
    private CompteRepository compteRepository;

    @GetMapping(value = "/listComptes")
    public List<Compte> listComptes() {
        return compteRepository.findAll();
    }

    @GetMapping(value = "listComptes/{id}")
    public Compte listComptes(@PathVariable(name = "id") Long id) {
        return compteRepository.findById(id).orElse(null);
    }

    @PutMapping(value = "listComptes/{id}")
    public Compte Update(@PathVariable(name = "id") Long id, @RequestBody Compte e) {
        e.setId(id);
        return compteRepository.save(e);
    }

    @PostMapping(value = "listComptes/")
    public Compte save(@RequestBody Compte e) {
        return compteRepository.save(e);
    }

    @DeleteMapping(value = "listComptes/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        compteRepository.deleteById(id);
    }
}
