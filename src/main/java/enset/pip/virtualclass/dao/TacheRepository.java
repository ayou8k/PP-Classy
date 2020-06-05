package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface TacheRepository extends JpaRepository<Tache, Long> {
}
