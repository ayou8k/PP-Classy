package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.NoteDevoir;
import enset.pip.virtualclass.entities.NoteDevoirCle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteDevoirRepository extends JpaRepository<NoteDevoir, NoteDevoirCle> {
}
