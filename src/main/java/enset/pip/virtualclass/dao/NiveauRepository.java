package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.Niveau;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
=======
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
>>>>>>> 92642c6641e18397803e99cad5c72548eb217296
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface NiveauRepository extends JpaRepository<Niveau, Long> {
}
