package enset.pip.virtualclass.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import enset.pip.virtualclass.entities.Etudiant;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
@CrossOrigin("*")
public interface EtudiantRepository extends JpaRepository<Etudiant, String>{
    @RestResource(path="/byFiliere")
     List<Etudiant> findEtudiantByClasseCode(@Param("mc") String des);
    @RestResource(path="/byFilierePage")
     Page<Etudiant> findEtudiantByClasseCode(@Param("mc") String des, Pageable pageable);
}
