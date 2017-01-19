package com.mybatis.main;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.mapper.RoleMapper;
import com.mybatis.mapper.UserMapper;
import com.mybatis.params.RoleParam;
import com.mybatis.po.Role;
import com.mybatis.util.SqlSessionFactoryUtil;

public class Main4 {
	static UserMapper userMapper;
	static RoleMapper roleMapper;
	
	public static void main(String[] args) {
		SqlSession session = SqlSessionFactoryUtil.openSqlSession();
		userMapper = session.getMapper(UserMapper.class);
		roleMapper = session.getMapper(RoleMapper.class);
		
//		testCountSurname("xiao");
//		testFindRoleByAnnotation("Liu", "note");
//		testFindRoleByParam(new RoleParam("Liu", "note"));
//		testInsertRoleByAutoPrimaryKey(new Role("Binbin Fan", "super star"));
//		testFindColumn("role_name", "t_role");
//		System.out.println("================ sepepate line ===================");
//		testFindColumn("user_name", "t_user");
		
		testGetRoleBySqlElement(15L);
		session.commit(); // 千万不要忘记提交 sql 执行.
		System.out.println("bingo.");
	}
	static void testGetRoleBySqlElement(Long id) {
		Role role = roleMapper.getRoleBySqlElement(id);
		System.out.println(role);
	}
	
	static void testFindColumn(String column, String table) {
		List<String> list = roleMapper.findColumn(column, table);
		for(String str: list)
			System.out.println(str);
	}
	
	static void testInsertRoleByAutoPrimaryKey(Role role) {
		int result = roleMapper.insertRoleByAutoPrimaryKey(role);
		System.out.println("result = " + result);
		System.out.println("role.id = " + role.getId()); // 打印数据库自动生成的主键值
	}
	static void testFindRoleByParam(RoleParam roleParam) {
		List<Role> list = roleMapper.findRoleByParam(roleParam);
		
		for(Role role: list)
			System.out.println(role);
	}
	static void testCountSurname(String surname) {
		int count = userMapper.countSurname(surname);
		System.out.println("count = " + count);
	}
	
	static void testFindRoleByAnnotation(
			String rolename, String note) {
		List<Role> list = roleMapper.findRoleByAnnotation(rolename, note);
		
		for(Role r: list)
			System.out.println(r);
	}
}
