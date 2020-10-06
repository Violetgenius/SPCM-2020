package com.webapp.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.model.student;
import com.webapp.repository.studentrepository;


@Service
@Transactional
public class studentserviceimplementation implements studentservice {

	@Autowired
	studentrepository studentRepository;
	
	
	public List<student> getAllStudents() {
		return (List<student>) studentRepository.findAll();
	}


	public student getStudentById(int id) {
		return studentRepository.findById(id).get();
	}

	public void addStudent(student student) {
		studentRepository.save(student);
	}

	
	public void deleteStudent(int id) {
		studentRepository.deleteById(id);
	}

}

