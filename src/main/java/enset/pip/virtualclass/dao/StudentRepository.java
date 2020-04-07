package enset.pip.virtualclass.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import enset.pip.virtualclass.entities.Student;

public interface StudentRepository extends JpaRepository<Student, String>{

}
