//package enset.pip.virtualclass.web;
//
//import enset.pip.virtualclass.dao.NoteDevoirCleRepository;
//import enset.pip.virtualclass.entities.NoteDevoirCle;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//
//public class NoteDevoirCleController {
//    @Autowired
//    private NoteDevoirCleRepository noteDevoirCleRepository;
//    @GetMapping(value = "/listNoteDevoirCles")
//    public List<NoteDevoirCle> listNoteDevoirCles()
//    {
//        return noteDevoirCleRepository.findAll();
//    }
//
//    @GetMapping(value = "listNoteDevoirCles/{id}")
//    public NoteDevoirCle listNoteDevoirCles(@PathVariable(name="id") Long id)
//    {
//        return noteDevoirCleRepository.findById(id).orElse(null);
//    }
//    @PutMapping(value = "listNoteDevoirCles/{id}")
//    public NoteDevoirCle Update(@PathVariable(name="id") Long id, @RequestBody NoteDevoirCle e)
//    {
//        e.setDevoirId(id);
//        return noteDevoirCleRepository.save(e);
//    }
//    @PostMapping(value = "listNoteDevoirCles/")
//    public NoteDevoirCle save(@RequestBody NoteDevoirCle e)
//    {
//        return noteDevoirCleRepository.save(e);
//    }
//    @DeleteMapping(value = "listNoteDevoirCles/{id}")
//    public void delete(@PathVariable(name="id") Long id)
//    {
//        noteDevoirCleRepository.deleteById(id);
//    }
//}
