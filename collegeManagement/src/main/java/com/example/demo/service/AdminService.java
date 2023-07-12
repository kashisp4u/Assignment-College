package com.example.demo.service;

import com.example.demo.model.Administrator;

public interface AdminService {

	public String saveAdmin(Administrator administrator);
	public Administrator loginAdmin(String name,String password);
}
