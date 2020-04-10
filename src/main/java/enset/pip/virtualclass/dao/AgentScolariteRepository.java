package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.AgentScolarite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface AgentScolariteRepository extends JpaRepository<AgentScolarite,Long> {
}
