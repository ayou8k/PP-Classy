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
    public List<Filiere> listFilieres()
    {
        return filiereRepository.findAll();
    }

    @GetMapping(value = "listFilieres/{id}")
    public Filiere listFilieres(@PathVariable(name="id") Long id)
    {
        return filiereRepository.findById(id).orElse(null);
    }
    @PutMapping(value = "listFilieres/{id}")
    public Filiere Update(@PathVariable(name="id") Long id, @RequestBody Filiere e)
    {
        e.setId(id);
        return filiereRepository.save(e);
    }
    @PostMapping(value = "listFilieres/")
    public Filiere save(@RequestBody Filiere e)
    {
        return filiereRepository.save(e);
    }
    @DeleteMapping(value = "listFilieres/{id}")
    public void delete(@PathVariable(name="id") Long id)
    {
        filiereRepository.deleteById(id);
    }
}
