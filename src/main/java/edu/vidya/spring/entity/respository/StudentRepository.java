package edu.vidya.spring.entity.respository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.vidya.spring.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
