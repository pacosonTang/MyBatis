package com.mybatis.main;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.mapper.CardMapper;
import com.mybatis.mapper.RoleMapper;
import com.mybatis.mapper.StudentMapper;
import com.mybatis.mapper.UserMapper;
import com.mybatis.po.Card;
import com.mybatis.po.Student;
import com.mybatis.util.SqlSessionFactoryUtil;

public class Main4_cascade {
	static UserMapper userMapper;
	static RoleMapper roleMapper;
	static StudentMapper stuMapper;
	static CardMapper cardMapper;
	
	public static void main(String[] args) {
		SqlSession session = SqlSessionFactoryUtil.openSqlSession();
		userMapper = session.getMapper(UserMapper.class);
		roleMapper = session.getMapper(RoleMapper.class);
		stuMapper = session.getMapper(StudentMapper.class);
		cardMapper = session.getMapper(CardMapper.class);
		
		testFindStudentByStuId(2);
		session.commit(); // 千万不要忘记提交 sql 执行.
		System.out.println("bingo.");
	}
	static void testFindStudentByStuId(int id) {
		Student stu = stuMapper.findStudentByStuId(id);
		System.out.println(stu);
	}
	static void findCardByStuId(int id) {
		Card card = cardMapper.findCardByStuId(id);
		System.out.println(card);
	}
}
