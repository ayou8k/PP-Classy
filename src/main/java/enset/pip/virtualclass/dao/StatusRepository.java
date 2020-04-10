package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
