package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.Publication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicationRepository extends JpaRepository<Publication, Long> {
}
