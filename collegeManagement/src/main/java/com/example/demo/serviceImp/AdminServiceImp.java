package com.example.demo.serviceImp;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Administrator;
import com.example.demo.repo.AdminRepository;
import com.example.demo.service.AdminService;

@Service
public class AdminServiceImp implements AdminService {

	private static final Logger logger = Logger.getLogger(AdminServiceImp.class);

	@Autowired
	AdminRepository repo;

	@Override
	public String saveAdmin(Administrator administrator) {
		administrator.setRoles("ADMIN");
		repo.save(administrator);
		logger.info("Data saved user and admin " + administrator);
		return "Added";
	}

	@Override
	public Administrator loginAdmin(String name, String password) {
		// TODO Auto-generated method stub
		List<Administrator> list = repo.findByNameAdmin(name);
		logger.info(" the list of data " + list + " Name is :" + name);
		for (Administrator administrator : list) {
			if (administrator.getPasswordAdmin().equals(password)) {
				logger.info("Data found ");
				return administrator;
			}
		}
		logger.error("Not found matching data" + name);
		return null;
	}
}
