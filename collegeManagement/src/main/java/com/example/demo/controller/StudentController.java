package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService student_Service;

	@GetMapping("/loginstudent")
	ResponseEntity<Student> loginStudent(@RequestParam String nameStudent, @RequestParam String passwordStudent) {
		return new ResponseEntity<Student>(student_Service.loginStudent(nameStudent, passwordStudent),
				HttpStatus.FOUND);
	}
	
}
