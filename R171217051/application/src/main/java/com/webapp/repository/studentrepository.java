package com.webapp.repository;
import org.springframework.data.repository.CrudRepository;

import com.webapp.model.student;

public interface studentrepository extends CrudRepository<student, Integer> {
	
}
