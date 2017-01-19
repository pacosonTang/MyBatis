package com.mybatis.main;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.mapper.RoleMapper;
import com.mybatis.po.Role;
import com.mybatis.util.SqlSessionFactoryUtil;

public class MyMain {
	static RoleMapper mapper;
	
	public static void main(String[] args) {
		SqlSession session = SqlSessionFactoryUtil.openSqlSession();
		mapper = session.getMapper(RoleMapper.class);
		/*
		int len = 10;
		for (int i = 0; i < len; i++) {
			insertRoleTest(new Role("Liu" + i,"note" + i));
		}*/
		
//		 deleteRoleTest(10L);
		findRoleTest("Liu");
		System.out.println("==========================");
		 getRoleTest(15L);
		
		 session.commit(); // 千万不要忘记提交 sql 执行.
		System.out.println("bingo.");
	}
	
	static void getRoleTest(Long id) {
		Role role = mapper.getRole(id);
		System.out.println(role);
	}
	
	static void deleteRoleTest(Long id) {
		mapper.deleteRole(id);
	}
	
	static void insertRoleTest(Role role) {
		mapper.insertRole(role);
	}
	
	static void findRoleTest(String roleName) {
		List<Role> list = mapper.findRole(roleName);
		for(Role role: list)
			System.out.println(role);
	}
}
