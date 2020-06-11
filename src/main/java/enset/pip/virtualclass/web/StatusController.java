package enset.pip.virtualclass.web;

import enset.pip.virtualclass.dao.StatusRepository;
import enset.pip.virtualclass.dao.StatusRepository;
import enset.pip.virtualclass.entities.Status;
import enset.pip.virtualclass.entities.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class StatusController {
    @Autowired
    private StatusRepository statueRepository;

    @GetMapping(value = "/liststatuts")
    public List<Status> liststatuss() {
        return statueRepository.findAll();
    }

    @GetMapping(value = "Getstatut/{id}")
    public Status liststatuss(@PathVariable(name = "id") Long id) {
        return statueRepository.findById(id).orElse(null);
    }

    @PutMapping(value = "Updatestatut/{id}")
    public Status Update(@PathVariable(name = "id") Long id, @RequestBody Status e) {
        e.setId(id);
        return statueRepository.save(e);
    }

    @PostMapping(value = "Createstatut/")
    public Status save(@RequestBody Status e) {
        return statueRepository.save(e);
    }

    @DeleteMapping(value = "Deletestatut/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        statueRepository.deleteById(id);
    }
}
