package com.mybatis.mapper;

import org.apache.ibatis.annotations.Param;

import com.mybatis.po.Student;

public interface StudentMapper {
	Student findStudentByStuId(@Param("stuId")int stuId);
}
