package com.mybatis.main;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mybatis.mapper.UserMapper;
import com.mybatis.po.User;
import com.mybatis.util.SqlSessionFactoryUtil;

public class Main4_discriminator {
	private UserMapper userMapper;
	private SqlSession session;
	
	@Before
	public void init() {
		session = SqlSessionFactoryUtil.openSqlSession();
		userMapper = session.getMapper(UserMapper.class);
	}
	@After
	public void myFinal() {
		session.commit(); // 千万不要忘记提交 sql 执行.
		System.out.println("bingo.");
	}
	
	@Test
	public void testGetUser() {
		User user = userMapper.getUser(15L);
		System.out.println(user.getClass().getSimpleName());
	}
}
