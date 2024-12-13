package edu.vidya.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.vidya.spring.entity.Subject;
import edu.vidya.spring.service.SubjectService;

@RestController
@RequestMapping("/api/subjects")
@SpringBootApplication(scanBasePackages = "edu.vidya.spring")
public class SubjectController {
	
	
	    @Autowired
	    private SubjectService subjectService;

	    @PostMapping
	    public ResponseEntity<Subject> createSubject(@RequestBody Subject subject) {
	        return new ResponseEntity<>(subjectService.saveSubject(subject), HttpStatus.CREATED);
	    }

	    @GetMapping
	    public ResponseEntity<List<Subject>> getSubjects() {
	        return new ResponseEntity<>(subjectService.getAllSubjects(), HttpStatus.OK);
	    
	}


}
