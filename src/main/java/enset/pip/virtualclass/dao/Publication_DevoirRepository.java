package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.Publication_Cours;
import enset.pip.virtualclass.entities.Publication_Devoir;
import enset.pip.virtualclass.entities.Publication_Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
<<<<<<< HEAD
=======

@CrossOrigin("*")
>>>>>>> 92642c6641e18397803e99cad5c72548eb217296

@CrossOrigin("*")
public interface Publication_DevoirRepository extends JpaRepository<Publication_Devoir, Long> {
}
