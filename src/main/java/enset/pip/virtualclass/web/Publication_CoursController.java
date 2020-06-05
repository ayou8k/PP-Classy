package enset.pip.virtualclass.web;

import enset.pip.virtualclass.dao.Publication_CoursRepository;
import enset.pip.virtualclass.entities.Publication_Cours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class Publication_CoursController {
    @Autowired
    private Publication_CoursRepository publication_CoursRepository;

    @GetMapping(value = "/listPublication_Cours")
    public List<Publication_Cours> listPublication_Cours() {
        return publication_CoursRepository.findAll();
    }

    @GetMapping(value = "listPublication_Cours/{id}")
    public Publication_Cours listPublication_Cours(@PathVariable(name = "id") Long id) {
        return publication_CoursRepository.findById(id).orElse(null);
    }

    @PutMapping(value = "listPublication_Cours/{id}")
    public Publication_Cours Update(@PathVariable(name = "id") Long id, @RequestBody Publication_Cours e) {
        e.setId(id);
        return publication_CoursRepository.save(e);
    }

    @PostMapping(value = "listPublication_Cours/")
    public Publication_Cours save(@RequestBody Publication_Cours e) {
        return publication_CoursRepository.save(e);
    }

    @DeleteMapping(value = "listPublication_Cours/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        publication_CoursRepository.deleteById(id);
    }
}
