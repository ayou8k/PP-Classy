package enset.pip.virtualclass.web;

import enset.pip.virtualclass.dao.ModuleRepository;
import enset.pip.virtualclass.entities.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ModuleController {
    @Autowired
    private ModuleRepository moduleRepository;
    @GetMapping(value = "/listModules")
    public List<Module> listModules()
    {
        return moduleRepository.findAll();
    }

    @GetMapping(value = "listModules/{id}")
    public Module listModules(@PathVariable(name="id") Long id)
    {
        return moduleRepository.findById(id).orElse(null);
    }
    @PutMapping(value = "listModules/{id}")
    public Module Update(@PathVariable(name="id") Long id, @RequestBody Module e)
    {
        e.setId(id);
        return moduleRepository.save(e);
    }
    @PostMapping(value = "listModules/")
    public Module save(@RequestBody Module e)
    {
        return moduleRepository.save(e);
    }
    @DeleteMapping(value = "listModules/{id}")
    public void delete(@PathVariable(name="id") Long id)
    {
        moduleRepository.deleteById(id);
    }
}
