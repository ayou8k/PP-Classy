package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
<<<<<<< HEAD
=======

@CrossOrigin("*")
>>>>>>> 92642c6641e18397803e99cad5c72548eb217296

@CrossOrigin("*")
public interface StatusRepository extends JpaRepository<Status, Long> {
}
