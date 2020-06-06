package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface MessageRepository extends JpaRepository<Message, Long> {
=======
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface MessageRepository extends JpaRepository<Message,Long> {
>>>>>>> 92642c6641e18397803e99cad5c72548eb217296
}
