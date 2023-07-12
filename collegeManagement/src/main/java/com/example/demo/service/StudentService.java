package com.example.demo.service;

import java.util.List;
import com.example.demo.model.Student;


public interface StudentService {
	
	public Student saveStudent(Student student);
	public Student updateStudent(Student student);
	public Student delectStudent(Integer id_Sudent);
	public List<Student> getAllStudent();
	public Student loginStudent(String name,String password);
	public Student updateGradeMarks(Integer id,Double marks,String garde);
	public List<Student> Save_multiStudent(List<Student> students);
	
}
