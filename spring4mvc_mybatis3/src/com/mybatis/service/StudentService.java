package com.mybatis.service;

import com.mybatis.model.Student;

public interface StudentService {
	
	void insertStudent(int id, String username);
	public Student getStudentById(int Id);  
}
