package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.model.Teacher;
import com.example.demo.service.StudentService;
import com.example.demo.service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	StudentService student_Service;
	
	@Autowired
	TeacherService teacher_Service;
	
	@GetMapping("/loginteacher")
	ResponseEntity<Teacher> loginTeacher(@RequestParam String nameTeacher, @RequestParam String passwordTeacher) {
		return new ResponseEntity<Teacher>(teacher_Service.loginTeacher(nameTeacher, passwordTeacher),
				HttpStatus.FOUND);
	}

	@PostMapping("/saveStudent")
	ResponseEntity<Student> saveTeacher(@RequestBody Student student) {
		return new ResponseEntity<Student>(student_Service.saveStudent(student), HttpStatus.CREATED);
	}
	
	@GetMapping("/getallstudent")
	ResponseEntity<List<Student>> getAllTeacher(){
	return new ResponseEntity<List<Student>>(student_Service.getAllStudent(),HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/updateStudent")
	ResponseEntity<Student> update_Marks_Grade(@RequestParam Integer idStudent,@RequestParam Double marks,@RequestParam  String grade) {
		return new ResponseEntity<Student>(student_Service.updateGradeMarks(idStudent, marks, grade), HttpStatus.CREATED);
	}
	
	@PostMapping("/saveMultipleStudent")
	ResponseEntity<List<Student>> multiStudents(@RequestBody List<Student> students) {
		return new ResponseEntity<List<Student>>(student_Service.Save_multiStudent(students), HttpStatus.CREATED);
	}
	
}
