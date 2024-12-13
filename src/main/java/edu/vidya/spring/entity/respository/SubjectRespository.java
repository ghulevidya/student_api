package edu.vidya.spring.entity.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.vidya.spring.entity.Subject;

@Repository
public interface SubjectRespository extends JpaRepository<Subject, Long> {

}
