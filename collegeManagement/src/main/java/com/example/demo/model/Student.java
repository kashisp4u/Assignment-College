package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "Student")
public class Student {
	
	@Id
	private int idStudent;
	private String nameStudent;
	private String passwordStudent;
	private String subject;
	private Double marks;
	private String grade;

	public Student() {

	}

	public Student(int idStudent, String nameStudent, String passwordStudent, String subject, Double marks,
			String grade) {
		super();
		this.idStudent = idStudent;
		this.nameStudent = nameStudent;
		this.passwordStudent = passwordStudent;
		this.subject = subject;
		this.marks = marks;
		this.grade = grade;
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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
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
				+ passwordStudent + ", subject=" + subject + ", marks=" + marks + ", grade=" + grade + "]";
	}

}
