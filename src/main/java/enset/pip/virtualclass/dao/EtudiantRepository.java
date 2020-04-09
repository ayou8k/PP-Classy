package enset.pip.virtualclass.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import enset.pip.virtualclass.entities.Etudiant;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource

public interface EtudiantRepository extends JpaRepository<Etudiant, String>{
    @RestResource(path="/byFiliere")
     List<Etudiant> findEtudiantByClasseContains(@Param("mc") String des);
    @RestResource(path="/byFilierePage")
     Page<Etudiant> findEtudiantByClasseContains(@Param("mc") String des, Pageable pageable);
}
