package com.example.demo.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Administrator;

import com.example.demo.repo.AdminRepository;
import com.example.demo.service.AdminService;

@Service
public class AdminServiceImp implements AdminService {

	@Autowired
	AdminRepository repo;

	@Override
	public String saveAdmin(Administrator administrator) {
		repo.save(administrator);
		return "Added";
	}

	@Override
	public Administrator loginAdmin(String name, String password) {
		// TODO Auto-generated method stub
    List<Administrator> list = repo.findByNameAdmin(name);
    
		for (Administrator administrator : list) {
			if (administrator.getPasswordAdmin().equals(password)) {
				return administrator;
			}
		}
		return null;
	}
}
