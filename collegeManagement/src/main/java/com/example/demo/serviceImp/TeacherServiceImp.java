package com.example.demo.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Teacher;
import com.example.demo.repo.TeacherRepository;
import com.example.demo.service.TeacherService;

@Service
public class TeacherServiceImp implements TeacherService {

	@Autowired
	TeacherRepository repo;


	@Override
	public Teacher saveTeacher(Teacher teacher) {
		teacher.setRoles("TEACHER");
		repo.save(teacher);
		return teacher;
	}

	@Override
	public List<Teacher> getTeachers() {
		List<Teacher> list = repo.findAll();
		return list;
	}

	@Override
	public Teacher deleteTeacher(Integer id) {
		Teacher teacher = repo.findById(id).orElseThrow(null);
		if (teacher != null) {
			repo.delete(teacher);
			return teacher;
		} else {
			throw new RuntimeException("Given data is not found");
		}
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		Teacher teacher2 = repo.findById(teacher.getIdTeacher()).orElseThrow(null);
		if (teacher2 != null) {
			repo.save(teacher2);
			return teacher2;
		} else {
			throw new RuntimeException("Given data is not found ");
		}
	}

	@Override
	public Teacher loginTeacher(String name, String password) {
		List<Teacher> list = repo.findByNameTeacher(name);
		for (Teacher teacher : list) {
			if (teacher.getPasswordTeacher().equals(password)) {
				return teacher;
			}
		}
		throw new RuntimeException("NOt found");

	}

}
