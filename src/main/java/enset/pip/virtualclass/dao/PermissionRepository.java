package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<Permission,Long> {
}
