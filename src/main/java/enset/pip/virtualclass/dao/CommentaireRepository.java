package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentaireRepository extends JpaRepository<Commentaire, Long> {
}
