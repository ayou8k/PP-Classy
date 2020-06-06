package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.Publication_Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface Publication_CoursRepository extends JpaRepository<Publication_Cours,Long> {
}
