package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.Niveau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface NiveauRepository extends JpaRepository<Niveau, Long> {
}
