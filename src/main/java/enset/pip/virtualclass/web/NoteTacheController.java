package enset.pip.virtualclass.web;

import enset.pip.virtualclass.dao.NoteTacheRepository;
import enset.pip.virtualclass.entities.NoteTache;
import enset.pip.virtualclass.entities.NoteTacheCle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class NoteTacheController {
    @Autowired
    private NoteTacheRepository noteTacheRepository;

    @GetMapping(value = "/listNoteTaches")
    public List<NoteTache> listNoteTaches() {
        return noteTacheRepository.findAll();
    }

    @GetMapping(value = "GetNoteTache/{id}")
    public NoteTache listNoteTaches(@PathVariable(name = "id") NoteTacheCle id) {
        return noteTacheRepository.findById(id).orElse(null);
    }

    @PutMapping(value = "UpdateNoteTache/{id}")
    public NoteTache Update(@PathVariable(name = "id") NoteTacheCle id, @RequestBody NoteTache e) {
        e.setId(id);
        return noteTacheRepository.save(e);
    }

    @PostMapping(value = "CreateNoteTache/")
    public NoteTache save(@RequestBody NoteTache e) {
        return noteTacheRepository.save(e);
    }

    @DeleteMapping(value = "DeleteNoteTache/{id}")
    public void delete(@PathVariable(name = "id") NoteTacheCle id) {
        noteTacheRepository.deleteById(id);
    }
}
