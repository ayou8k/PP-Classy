package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.AgentScolarite;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

<<<<<<< HEAD
@RepositoryRestResource
@CrossOrigin("*")
public interface AgentScolariteRepository extends JpaRepository<AgentScolarite, Long> {
=======
@CrossOrigin("*")

public interface AgentScolariteRepository extends JpaRepository<AgentScolarite,Long> {
>>>>>>> 92642c6641e18397803e99cad5c72548eb217296

}
