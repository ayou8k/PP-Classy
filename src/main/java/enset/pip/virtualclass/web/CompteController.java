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
    public List<Compte> listCompte() {
        return compteRepository.findAll();
    }

    @GetMapping(value = "GetCompte/{id}")
    public Compte listCompte(@PathVariable(name = "id") Long id) {
        return compteRepository.findById(id).orElse(null);
    }

    @PutMapping(value = "UpdateCompte/{id}")
    public Compte Update(@PathVariable(name = "id") Long id, @RequestBody Compte e) {
        e.setId(id);
        return compteRepository.save(e);
    }

    @PostMapping(value = "CreateCompte/")
    public Compte save(@RequestBody Compte e) {
        return compteRepository.save(e);
    }

    @DeleteMapping(value = "DeleteCompte/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        compteRepository.deleteById(id);
    }
}
