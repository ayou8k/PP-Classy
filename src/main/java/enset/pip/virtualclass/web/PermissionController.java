package enset.pip.virtualclass.web;

import enset.pip.virtualclass.dao.PermissionRepository;
import enset.pip.virtualclass.entities.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class PermissionController {
    @Autowired
    private PermissionRepository permissionRepository;

    @GetMapping(value = "/listPermissions")
    public List<Permission> listPermissions() {
        return permissionRepository.findAll();
    }

    @GetMapping(value = "GetPermission/{id}")
    public Permission listPermissions(@PathVariable(name = "id") Long id) {
        return permissionRepository.findById(id).orElse(null);
    }

    @PutMapping(value = "UpdatePermission/{id}")
    public Permission Update(@PathVariable(name = "id") Long id, @RequestBody Permission e) {
        e.setId(id);
        return permissionRepository.save(e);
    }

    @PostMapping(value = "CreatePermission/")
    public Permission save(@RequestBody Permission e) {
        return permissionRepository.save(e);
    }

    @DeleteMapping(value = "DeletePermission/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        permissionRepository.deleteById(id);
    }
}
