package com.example.demo.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Administrator;

@Repository
public interface AdminRepository extends MongoRepository<Administrator , Integer> {
	
	@Query("{ 'nameAdmin'  : ?0 }")
	List<Administrator> findByNameAdmin(String nameAdmin);
}
