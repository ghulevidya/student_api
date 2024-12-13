package edu.vidya.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.vidya.spring.entity.Student;
import edu.vidya.spring.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	
	
	    @Autowired
	    private StudentService studentService;

	    @PostMapping
	    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
	        return new ResponseEntity<>(studentService.saveStudent(student), HttpStatus.CREATED);
	    }

	    @GetMapping
	    public ResponseEntity<List<Student>> getStudents() {
	        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
	    
	}


}
