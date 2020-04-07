package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.Departement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartementRepository extends JpaRepository<Departement, Long> {
}
