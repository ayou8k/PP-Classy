package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface CommentaireRepository extends JpaRepository<Commentaire, Long> {
}
