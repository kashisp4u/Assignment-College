package com.example.demo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "teacher")
public class Teacher {
	@Id
	private int idTeacher;
	private String nameTeacher;
	private String passwordTeacher;
	private int experince;
	private List<String> subjects;
	private String qualification;
	private String email;
	
	public Teacher() {
		
	}
	
	public Teacher(int idTeacher, String nameTeacher, String passwordTeacher, int experince, List<String> subjects,
			String qualification, String email) {
		super();
		this.idTeacher = idTeacher;
		this.nameTeacher = nameTeacher;
		this.passwordTeacher = passwordTeacher;
		this.experince = experince;
		this.subjects = subjects;
		this.qualification = qualification;
		this.email = email;
	}
	public int getIdTeacher() {
		return idTeacher;
	}
	public void setIdTeacher(int idTeacher) {
		this.idTeacher = idTeacher;
	}
	public String getNameTeacher() {
		return nameTeacher;
	}
	public void setNameTeacher(String nameTeacher) {
		this.nameTeacher = nameTeacher;
	}
	public String getPasswordTeacher() {
		return passwordTeacher;
	}
	public void setPasswordTeacher(String passwordTeacher) {
		this.passwordTeacher = passwordTeacher;
	}
	public int getExperince() {
		return experince;
	}
	public void setExperince(int experince) {
		this.experince = experince;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Teacher [idTeacher=" + idTeacher + ", nameTeacher=" + nameTeacher + ", passwordTeacher="
				+ passwordTeacher + ", experince=" + experince + ", subjects=" + subjects + ", qualification="
				+ qualification + ", email=" + email + "]";
	}
	
	
	
}
