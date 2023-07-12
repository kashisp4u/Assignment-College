package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Teacher;

public interface TeacherService {
	
	public Teacher saveTeacher(Teacher teacher);
	public List<Teacher> getTeachers();
	public Teacher deleteTeacher(Integer id);
	public Teacher updateTeacher(Teacher teacher);
	public Teacher loginTeacher(String name ,String password);
	
}
