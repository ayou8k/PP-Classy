package enset.pip.virtualclass.web;

import enset.pip.virtualclass.dao.Publication_ForumRepository;
import enset.pip.virtualclass.entities.Publication_Forum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class Publication_ForumController {
    @Autowired
    private Publication_ForumRepository publication_ForumRepository;

    @GetMapping(value = "/listPublication_Forums")
    public List<Publication_Forum> listPublication_Forums() {
        return publication_ForumRepository.findAll();
    }

    @GetMapping(value = "listPublication_Forums/{id}")
    public Publication_Forum listPublication_Forums(@PathVariable(name = "id") Long id) {
        return publication_ForumRepository.findById(id).orElse(null);
    }

    @PutMapping(value = "listPublication_Forums/{id}")
    public Publication_Forum Update(@PathVariable(name = "id") Long id, @RequestBody Publication_Forum e) {
        e.setId(id);
        return publication_ForumRepository.save(e);
    }

    @PostMapping(value = "listPublication_Forums/")
    public Publication_Forum save(@RequestBody Publication_Forum e) {
        return publication_ForumRepository.save(e);
    }

    @DeleteMapping(value = "listPublication_Forums/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        publication_ForumRepository.deleteById(id);
    }
}
