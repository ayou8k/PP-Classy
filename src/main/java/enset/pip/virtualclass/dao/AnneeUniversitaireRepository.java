package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.AnneeUniversitaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface AnneeUniversitaireRepository extends JpaRepository<AnneeUniversitaire, Long> {
}
