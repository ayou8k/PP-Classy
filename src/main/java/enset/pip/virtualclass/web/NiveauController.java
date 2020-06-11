package enset.pip.virtualclass.web;

import enset.pip.virtualclass.dao.NiveauRepository;
import enset.pip.virtualclass.entities.Niveau;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class NiveauController {
    @Autowired
    private NiveauRepository niveauRepository;

    @GetMapping(value = "/listNiveaux")
    public List<Niveau> listNiveaux() {
        return niveauRepository.findAll();
    }

    @GetMapping(value = "GetNiveau/{id}")
    public Niveau listNiveaux(@PathVariable(name = "id") Long id) {
        return niveauRepository.findById(id).orElse(null);
    }

    @PutMapping(value = "UpdateNiveau/{id}")
    public Niveau Update(@PathVariable(name = "id") Long id, @RequestBody Niveau e) {
        e.setId(id);
        return niveauRepository.save(e);
    }

    @PostMapping(value = "CreateNiveau/")
    public Niveau save(@RequestBody Niveau e) {
        return niveauRepository.save(e);
    }

    @DeleteMapping(value = "DeleteNiveau/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        niveauRepository.deleteById(id);
    }
}
