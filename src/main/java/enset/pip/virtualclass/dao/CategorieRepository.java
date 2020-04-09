package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}
