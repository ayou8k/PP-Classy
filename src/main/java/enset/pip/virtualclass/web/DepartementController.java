package enset.pip.virtualclass.web;

import enset.pip.virtualclass.dao.DepartementRepository;
import enset.pip.virtualclass.entities.Departement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class DepartementController {
    @Autowired
    private DepartementRepository departementRepository;

    @GetMapping(value = "/listDepartements")
    public List<Departement> listDepartement() {
        return departementRepository.findAll();
    }

    @GetMapping(value = "GetDepartement/{id}")
    public Departement listDepartement(@PathVariable(name = "id") Long id) {
        return departementRepository.findById(id).orElse(null);
    }

    @PutMapping(value = "UpdateDepartement/{id}")
    public Departement Update(@PathVariable(name = "id") Long id, @RequestBody Departement e) {
        e.setId(id);
        return departementRepository.save(e);
    }

    @PostMapping(value = "CreateDepartement/")
    public Departement save(@RequestBody Departement e) {
        return departementRepository.save(e);
    }

    @DeleteMapping(value = "DeleteDepartement/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        departementRepository.deleteById(id);
    }

}
