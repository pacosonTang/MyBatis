package com.mybatis.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybatis.dao.StudentMapper;
import com.mybatis.model.Student;
import com.mybatis.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public void insertStudent(int id, String username) {
		Student stu = new Student(id, username);
	}

	@Override
	public Student getStudentById(int id) {
		return studentMapper.selectByPrimaryKey(id);
	}
}
