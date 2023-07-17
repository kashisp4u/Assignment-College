package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Administrator")
<<<<<<< HEAD
public class Administrator  {
=======
public class Administrator {
>>>>>>> 007c46b85b8665383b098d524713c43b746c6215

	@Id
	private int id;
	private String nameAdmin;
	private String passwordAdmin;
	private String roles;

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public Administrator() {
	}

	public Administrator(int id, String nameAdmin, String passwordAdmin, String roles) {
		super();
		this.id = id;
		this.nameAdmin = nameAdmin;
		this.passwordAdmin = passwordAdmin;
		this.roles = roles;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameAdmin() {
		return nameAdmin;
	}

	public void setNameAdmin(String nameAdmin) {
		this.nameAdmin = nameAdmin;
	}

	public String getPasswordAdmin() {
		return passwordAdmin;
	}

	public void setPasswordAdmin(String passwordAdmin) {
		this.passwordAdmin = passwordAdmin;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", nameAdmin=" + nameAdmin + ", passwordAdmin=" + passwordAdmin + "]";
	}

}
