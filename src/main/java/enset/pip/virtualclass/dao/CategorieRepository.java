package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}
