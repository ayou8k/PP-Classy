package enset.pip.virtualclass.web;

import enset.pip.virtualclass.dao.RoleRepository;
import enset.pip.virtualclass.entities.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class RoleController {
    @Autowired
    private RoleRepository roleRepository;

    @GetMapping(value = "/listRoles")
    public List<Role> listRoles() {
        return roleRepository.findAll();
    }

    @GetMapping(value = "GetRole/{id}")
    public Role listRoles(@PathVariable(name = "id") Long id) {
        return roleRepository.findById(id).orElse(null);
    }

    @PutMapping(value = "UpdateRole/{id}")
    public Role Update(@PathVariable(name = "id") Long id, @RequestBody Role e) {
        e.setId(id);
        return roleRepository.save(e);
    }

    @PostMapping(value = "CreateRole/")
    public Role save(@RequestBody Role e) {
        return roleRepository.save(e);
    }

    @DeleteMapping(value = "DeleteRole/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        roleRepository.deleteById(id);
    }
}
