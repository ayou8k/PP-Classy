package enset.pip.virtualclass.web;

import enset.pip.virtualclass.dao.EtudiantRepository;
import enset.pip.virtualclass.entities.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;

@RestController
public class EtudiantRestServices {
     @Autowired
    private EtudiantRepository etudiantRepository;
     @GetMapping(value = "/listEtudiants")
    public List<Etudiant> listEtudiants()
     {
         return etudiantRepository.findAll();
     }

     @GetMapping(value = "listEtudiants/{id}")
             public Etudiant listEtudiants(@PathVariable(name="id") String id)
     {
         return etudiantRepository.findById(id).get();
     }
    @PutMapping(value = "listEtudiants/{id}")
    public Etudiant Update(@PathVariable(name="id") String id, @RequestBody Etudiant e)
    {
        e.setId(id);
        return etudiantRepository.save(e);
    }
    @PostMapping(value = "listEtudiants/")
    public Etudiant save(@RequestBody Etudiant e)
    {
        return etudiantRepository.save(e);
    }
    @DeleteMapping(value = "listEtudiants/{id}")
    public void delete(@PathVariable(name="id") String id)
    {
        etudiantRepository.deleteById(id);
    }
}
