package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
