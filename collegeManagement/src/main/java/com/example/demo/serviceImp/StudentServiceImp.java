package com.example.demo.serviceImp;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImp implements StudentService {
	
	private static final Logger LOGGER = Logger.getLogger(StudentServiceImp.class);

	@Autowired
	StudentRepository repo;
	
	
	@Override
	public Student saveStudent(Student student) {
		student.setRole("STUDENT");
		LOGGER.debug("Student role changes to STUDENT");
		Student s1 = repo.save(student);
		return s1;
	}

	@Override
	public Student updateStudent(Student student) {
		Student s1 = repo.findById(student.getIdStudent()).orElse(null);
		if (s1 != null) {
			repo.save(student);
			return student;
		}
		return s1;
	}

	@Override
	public Student delectStudent(Integer id) {
		Student s1 = repo.findById(id).orElse(null);
		if (s1 != null) {
					LOGGER.info("User data is deleted :"+s1);
			repo.delete(s1);
			return s1;
		}
		LOGGER.error("User not found ");
		return s1;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> list = repo.findAll(); 
		if(list.size()==0) {
			LOGGER.error("list is Empty");
		}
		return list;
	}


	@Override
	public Student loginStudent(String name, String password) {
		List<Student> list = repo.findByNameStudent(name);
		for (Student student :list ) {
			if (student.getPasswordStudent().equals(password)) {
				LOGGER.info("Succesfully found "+student);
				return student;
			}
		}
		LOGGER.error("Given username and password is not matched");
		throw new RuntimeException("NOt found");
	}

	@Override
	public Student updateGradeMarks(Integer id, Double marks, String garde) {
		Student student = repo.findById(id).orElse(null);
		if(student!=null) {
			student.setGrade(garde);
			student.setMarks(marks);
			repo.save(student);
			return student;
		}
		LOGGER.error("Given username is not found in student UpdateGradeMArks funcation ");
		throw new RuntimeException("not found ");
		
	}

	@Override
	public List<Student> Save_multiStudent(List<Student> students) {
		for(Student std:students) {
			std.setRole("STUDENT");
			repo.save(std);
		}
		return students;
		
	}

}
