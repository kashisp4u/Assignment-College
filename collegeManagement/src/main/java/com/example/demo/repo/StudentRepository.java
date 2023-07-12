package com.example.demo.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, Integer> {

	@Query("{ 'nameStudent' : ?0 }")
	List<Student> findByNameStudent(String nameStudent);
}
 