package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.Diplome;
import org.springframework.data.jpa.repository.JpaRepository;

import enset.pip.virtualclass.entities.Diplome;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface DiplomeRepository extends JpaRepository<Diplome, Long>{

}
