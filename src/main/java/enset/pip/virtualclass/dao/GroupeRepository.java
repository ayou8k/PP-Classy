package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.Groupe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin("*")
public interface GroupeRepository extends JpaRepository<Groupe,Long> {
}
