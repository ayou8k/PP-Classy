package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message,Long> {
}
