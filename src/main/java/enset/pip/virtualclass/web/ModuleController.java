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
    public List<Module> listModule() {
        return moduleRepository.findAll();
    }

    @GetMapping(value = "GetModule/{id}")
    public Module listModule(@PathVariable(name = "id") Long id) {
        return moduleRepository.findById(id).orElse(null);
    }

    @PutMapping(value = "UpdateModule/{id}")
    public Module Update(@PathVariable(name = "id") Long id, @RequestBody Module e) {
        e.setId(id);
        return moduleRepository.save(e);
    }

    @PostMapping(value = "CreateModule/")
    public Module save(@RequestBody Module e) {
        return moduleRepository.save(e);
    }

    @DeleteMapping(value = "DeleteModule/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        moduleRepository.deleteById(id);
    }
}
