package enset.pip.virtualclass.web;

import enset.pip.virtualclass.dao.AnneeUniversitaireRepository;
import enset.pip.virtualclass.entities.AnneeUniversitaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController

public class AnneeUniversitaireController {
    @Autowired
    private AnneeUniversitaireRepository anneeUniversitaireRepository;
    @GetMapping(value = "/listAnneeUniversitaires")
    public List<AnneeUniversitaire> listAnneeUniversitaires()
    {
        return anneeUniversitaireRepository.findAll();
    }

    @GetMapping(value = "listAnneeUniversitaires/{id}")
    public AnneeUniversitaire listAnneeUniversitaires(@PathVariable(name="id") Long id)
    {
        return anneeUniversitaireRepository.findById(id).orElse(null);
    }
    @PutMapping(value = "listAnneeUniversitaires/{id}")
    public AnneeUniversitaire Update(@PathVariable(name="id") Long id, @RequestBody AnneeUniversitaire e)
    {
        e.setId(id);
        return anneeUniversitaireRepository.save(e);
    }
    @PostMapping(value = "listAnneeUniversitaires/")
    public AnneeUniversitaire save(@RequestBody AnneeUniversitaire e)
    {
        return anneeUniversitaireRepository.save(e);
    }
    @DeleteMapping(value = "listAnneeUniversitaires/{id}")
    public void delete(@PathVariable(name="id") Long id)
    {
        anneeUniversitaireRepository.deleteById(id);
    }
}
