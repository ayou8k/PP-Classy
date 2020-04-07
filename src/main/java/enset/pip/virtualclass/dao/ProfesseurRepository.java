package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.Professeur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesseurRepository extends JpaRepository<Professeur,Long> {
}
