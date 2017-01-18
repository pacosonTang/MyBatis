package com.mybatis.main;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.mapper.RoleMapper;
import com.mybatis.po.Role;
import com.mybatis.util.SqlSessionFactoryUtil;

public class MyMain {
	static RoleMapper mapper;
	
	public static void main(String[] args) {
		SqlSession session = SqlSessionFactoryUtil.openSqlSession();
		mapper = session.getMapper(RoleMapper.class);
		
		int len = 10;
		for (int i = 0; i < len; i++) {
			insertRoleTest(new Role("Liu" + i,"note" + i));
		}
		
//		 getRoleTest(10L);
		 deleteRoleTest(10L);
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
}
