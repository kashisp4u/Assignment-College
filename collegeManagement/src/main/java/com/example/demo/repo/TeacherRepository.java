package com.example.demo.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Teacher;

@Repository
public interface TeacherRepository extends MongoRepository<Teacher, Integer>{

	@Query("{ 'nameTeacher'  : ?0 }")
	List<Teacher> findByNameTeacher(String nameTeacher);
}
