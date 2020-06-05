package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface StatusRepository extends JpaRepository<Status, Long> {
}
