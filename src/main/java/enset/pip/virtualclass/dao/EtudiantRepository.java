package enset.pip.virtualclass.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import enset.pip.virtualclass.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, String>{

}
