package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.Classe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface ClasseRepository extends JpaRepository<Classe, Long> {

}
