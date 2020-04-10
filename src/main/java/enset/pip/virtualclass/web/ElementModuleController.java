package enset.pip.virtualclass.web;

import enset.pip.virtualclass.dao.Element_moduleRepository;
import enset.pip.virtualclass.entities.Element_module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController

public class ElementModuleController {
    @Autowired
    private Element_moduleRepository element_moduleRepository;
    @GetMapping(value = "/listElement_modules")
    public List<Element_module> listElement_modules()
    {
        return element_moduleRepository.findAll();
    }

    @GetMapping(value = "listElement_modules/{id}")
    public Element_module listElement_modules(@PathVariable(name="id") Long id)
    {
        return element_moduleRepository.findById(id).orElse(null);
    }
    @PutMapping(value = "listElement_modules/{id}")
    public Element_module Update(@PathVariable(name="id") Long id, @RequestBody Element_module e)
    {
        e.setId(id);
        return element_moduleRepository.save(e);
    }
    @PostMapping(value = "listElement_modules/")
    public Element_module save(@RequestBody Element_module e)
    {
        return element_moduleRepository.save(e);
    }
    @DeleteMapping(value = "listElement_modules/{id}")
    public void delete(@PathVariable(name="id") Long id)
    {
        element_moduleRepository.deleteById(id);
    }
}
