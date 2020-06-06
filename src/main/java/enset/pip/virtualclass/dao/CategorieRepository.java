package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

<<<<<<< HEAD
@RepositoryRestResource
=======
>>>>>>> 92642c6641e18397803e99cad5c72548eb217296
@CrossOrigin("*")
public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}
