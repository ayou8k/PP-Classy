package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.Element_module;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface Element_moduleRepository extends JpaRepository<Element_module, Long> {
=======
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Collection;
import java.util.List;
@CrossOrigin("*")

public interface Element_moduleRepository extends JpaRepository<Element_module,Long> {
    @Query("SELECT E FROM Element_module E WHERE E.professeur.id = :id")
    List<Element_module> findAllByProfesseurId(@Param("id")Long id);
>>>>>>> 92642c6641e18397803e99cad5c72548eb217296
}
