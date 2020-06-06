package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.Classe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface ClasseRepository extends JpaRepository<Classe, Long> {

}
