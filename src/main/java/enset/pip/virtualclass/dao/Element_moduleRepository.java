package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.Element_module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface Element_moduleRepository extends JpaRepository<Element_module, Long> {
}
