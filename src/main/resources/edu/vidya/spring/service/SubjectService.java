package edu.vidya.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.vidya.spring.entity.Subject;
import edu.vidya.spring.entity.respository.SubjectRespository;

@Service
public class SubjectService {
	
	    @Autowired
	    private SubjectRespository subjectRepository;

	    public Subject saveSubject(Subject subject) {
	        return subjectRepository.save(subject);
	    }

	    public List<Subject> getAllSubjects() {
	        return subjectRepository.findAll();
	   
	}

}
