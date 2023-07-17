package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Student")
public class Student {

	@Id
	private int idStudent;
	private String nameStudent;
	private String passwordStudent;
	private String course;
	private Double marks;
	private String grade;
	private String role;

	public Student() {

	}

	public Student(int idStudent, String nameStudent, String passwordStudent, String course, Double marks, String grade,
			String role) {
		super();
		this.idStudent = idStudent;
		this.nameStudent = nameStudent;
		this.passwordStudent = passwordStudent;
		this.course = course;
		this.marks = marks;
		this.grade = grade;
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public String getNameStudent() {
		return nameStudent;
	}

	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}

	public String getPasswordStudent() {
		return passwordStudent;
	}

	public void setPasswordStudent(String passwordStudent) {
		this.passwordStudent = passwordStudent;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Double getMarks() {
		return marks;
	}

	public void setMarks(Double marks) {
		this.marks = marks;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [idStudent=" + idStudent + ", nameStudent=" + nameStudent + ", passwordStudent="
				+ passwordStudent + ", course=" + course + ", marks=" + marks + ", grade=" + grade + "]";
	}

}
