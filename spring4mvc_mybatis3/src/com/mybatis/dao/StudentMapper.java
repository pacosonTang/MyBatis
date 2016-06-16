package com.mybatis.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.mybatis.model.Student;
import com.mybatis.model.StudentExample;

public interface StudentMapper {
    /**
     * This method corresponds to the database table t_student
     */
    int countByExample(StudentExample example);

    /**
     * This method corresponds to the database table t_student
     */
    int deleteByExample(StudentExample example);

    /**
     * This method corresponds to the database table t_student
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method corresponds to the database table t_student
     */
    int insert(Student record);

    /**
     * This method corresponds to the database table t_student
     */
    int insertSelective(Student record);

    /**
     * This method corresponds to the database table t_student
     */
    List<Student> selectByExample(StudentExample example);

    /**
     * This method corresponds to the database table t_student
     */
    Student selectByPrimaryKey(Integer id);

    /**
     * This method corresponds to the database table t_student
     */
    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    /**
     * This method corresponds to the database table t_student
     */
    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    /**
     * This method corresponds to the database table t_student
     */
    int updateByPrimaryKeySelective(Student record);

    /**
     * This method corresponds to the database table t_student
     */
    int updateByPrimaryKey(Student record);
}