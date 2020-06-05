package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.NoteDevoir;
import enset.pip.virtualclass.entities.NoteDevoirCle;
import enset.pip.virtualclass.entities.NoteTache;
import enset.pip.virtualclass.entities.NoteTacheCle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface NoteTacheRepository extends JpaRepository<NoteTache, NoteTacheCle> {
}
