package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.AnneeUniversitaire;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.CrossOrigin;
=======
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin("*")
>>>>>>> 92642c6641e18397803e99cad5c72548eb217296

@CrossOrigin("*")
public interface AnneeUniversitaireRepository extends JpaRepository<AnneeUniversitaire, Long> {
}
