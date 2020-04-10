package enset.pip.virtualclass.web;

import enset.pip.virtualclass.dao.NoteTacheCleRepository;
import enset.pip.virtualclass.entities.NoteTacheCle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class NoteTacheCleController {
    @Autowired
    private NoteTacheCleRepository noteTacheCleRepository;
    @GetMapping(value = "/listNoteTacheCles")
    public List<NoteTacheCle> listNoteTacheCles()
    {
        return noteTacheCleRepository.findAll();
    }

    @GetMapping(value = "listNoteTacheCles/{id}")
    public NoteTacheCle listNoteTacheCles(@PathVariable(name="id") Long id)
    {
        return noteTacheCleRepository.findById(id).orElse(null);
    }
//    @PutMapping(value = "listNoteTacheCles/{id}")
//    public NoteTacheCle Update(@PathVariable(name="tache_id") Long tache_id,@PathVariable(name="group_id") Long group_id, @RequestBody NoteTacheCle e)
//    {
//        e.setGroupeId(group_id);
//        e.setTacheId(tache_id);
//        return noteTacheCleRepository.save(e);
//    }
    @PostMapping(value = "listNoteTacheCles/")
    public NoteTacheCle save(@RequestBody NoteTacheCle e)
    {
        return noteTacheCleRepository.save(e);
    }
    @DeleteMapping(value = "listNoteTacheCles/{id}")
    public void delete(@PathVariable(name="id") Long id)
    {
        noteTacheCleRepository.deleteById(id);
    }
}
