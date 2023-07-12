package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collation = "Administrator")
public class Administrator {

	@Id
	private int id;
	private String nameAdmin;
	private String passwordAdmin;

	public Administrator() {
	}

	public Administrator(int id, String nameAdmin, String passwordAdmin) {
		super();
		this.id = id;
		this.nameAdmin = nameAdmin;
		this.passwordAdmin = passwordAdmin;
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
