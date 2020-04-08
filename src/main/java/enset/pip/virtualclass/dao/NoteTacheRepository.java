package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.NoteDevoir;
import enset.pip.virtualclass.entities.NoteDevoirCle;
import enset.pip.virtualclass.entities.NoteTache;
import enset.pip.virtualclass.entities.NoteTacheCle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteTacheRepository extends JpaRepository<NoteTache, NoteTacheCle> {
}
