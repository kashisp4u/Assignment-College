package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Administrator;
import com.example.demo.model.Student;
import com.example.demo.model.Teacher;
import com.example.demo.service.AdminService;
import com.example.demo.service.StudentService;
import com.example.demo.service.TeacherService;

@RestController
@RequestMapping("/AdminController")
public class AdminController {

	@Autowired
	TeacherService teacher_Service;
	
	@Autowired
	AdminService admin_Service;
	
	@Autowired
	StudentService student_Service;


	@GetMapping("/loginadmin")
	ResponseEntity<Administrator> loginAdmin(@RequestParam String nameAdmin, @RequestParam String passwordAdmin) {
		return new ResponseEntity<Administrator>(admin_Service.loginAdmin(nameAdmin, passwordAdmin), HttpStatus.FOUND);
	}

	@PostMapping("/Addadmin")
	ResponseEntity<String> addAdmin(@RequestBody Administrator administrator){
	return new ResponseEntity<String>(admin_Service.saveAdmin(administrator),HttpStatus.CREATED);
	}
	

	@PostMapping("/SaveTeacher")
	ResponseEntity<Teacher> saveTeacher(@RequestBody Teacher teacher) {
		return new ResponseEntity<Teacher>(teacher_Service.saveTeacher(teacher), HttpStatus.CREATED);
	}
	
	@PutMapping("/UpdateTeacher")
	ResponseEntity<Teacher> updateTeacher(@RequestBody Teacher teacher) {
		return new ResponseEntity<Teacher>(teacher_Service.updateTeacher(teacher), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/DeleteTeacher")
	ResponseEntity<Teacher> deleteTeacher(@RequestParam Integer idTeacher) {
		return new ResponseEntity<Teacher>(teacher_Service.deleteTeacher(idTeacher), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/Getallteachers")
	ResponseEntity<List<Teacher>> getAllTeacher(){
	return new ResponseEntity<List<Teacher>>(teacher_Service.getTeachers(),HttpStatus.FOUND);
	}
	
	/*==========================Student===================================*/

	@PostMapping("/SaveStudent")
	ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		return new ResponseEntity<Student>(student_Service.saveStudent(student), HttpStatus.CREATED);
	}
	
	@PutMapping("/updateStudent")
	ResponseEntity<Student> updateStudent(@RequestBody Student student) {
		return new ResponseEntity<Student>(student_Service.updateStudent(student), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deleteStudent")
	ResponseEntity<Student> updateStudent(@RequestParam Integer idStudent) {
		return new ResponseEntity<Student>(student_Service.delectStudent(idStudent), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/Getallstudent")
	ResponseEntity<List<Student>> getAllStudent(){
	return new ResponseEntity<List<Student>>(student_Service.getAllStudent(),HttpStatus.FOUND);
	}
	
	
}
