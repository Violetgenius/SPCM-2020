package com.webapp.services;
import java.util.List;

import com.webapp.model.student;

public interface studentservice {

	
	 public List<student> getAllStudents();
	 
	 public student getStudentById(int id);
	 
	 public void addStudent(student student);
	 
	 public void deleteStudent(int id);
}
