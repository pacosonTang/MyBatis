package com.mybatis.main;

import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mybatis.mapper.RoleMapper;
import com.mybatis.mapper.UserMapper;
import com.mybatis.po.Role;
import com.mybatis.po.User;
import com.mybatis.util.SqlSessionFactoryUtil;

public class Main5 {
	private SqlSession session;
	private UserMapper userMapper;
	private RoleMapper roleMapper;
	
	@Before
	public void init() {
		session = SqlSessionFactoryUtil.openSqlSession();
		userMapper = session.getMapper(UserMapper.class);
		roleMapper = session.getMapper(RoleMapper.class);
	}
	@After
	public void myFinal() {
		session.commit(); // 千万不要忘记提交 sql 执行.
		System.out.println("bingo.");
	}
	
	@Test
	public void testFindRoleByIf() {
		List<Role> list = roleMapper.findRoleByIF(null, "huang");
		for(Role r: list)
			System.out.println(r);
	}
	@Test
	public void testFindRoleByChoose() {
//		List<Role> list = roleMapper.findRoleByChoose(15, "huang");
//		List<Role> list = roleMapper.findRoleByChoose(null, "huang");
		List<Role> list = roleMapper.findRoleByChoose(null, null);
		for(Role r: list)
			System.out.println(r);
	}
	
	@Test
	public void testFindRoleByWhere() {
//		List<Role> list = roleMapper.findRoleByWhere(15, "huang");
//		List<Role> list = roleMapper.findRoleByWhere(null, "huang");
		List<Role> list = roleMapper.findRoleByWhere(null, null);
		for(Role r: list)
			System.out.println(r);
		System.out.println("testFindRoleByWhere executed successfully.");
	}
	
	@Test
	public void testFindRoleByTrim() {
		List<Role> list = roleMapper.findRoleByTrim(15, "huang");
//		List<Role> list = roleMapper.findRoleByv(null, "huang");
//		List<Role> list = roleMapper.findRoleByTrim(null, null);
		for(Role r: list)
			System.out.println(r);
		System.out.println("testFindRoleByTrim executed successfully.");
	} 
	
	@Test
	public void testUpdateRoleById() {
		int result = roleMapper.updateRoleById(new Role(15, "zhoujielun", "senior engineering"));
		System.out.println("testUpdateRoleById executed successfully.");
	}
	
	@Test
	public void testFindUserBySexByForeach() {
		List<User> list = userMapper.findUserBySex(Arrays.asList(new Integer[]{1,2}));
		for(User r: list)
			System.out.println(r);
		System.out.println("testFindUserBySexByForeach executed successfully.");
	} 
	
	@Test
	public void testFindRoleByBind() {
		List<Role> list = roleMapper.findRoleByBind("huang");
		for(Role r: list)
			System.out.println(r);
		System.out.println("testFindRoleByBind executed successfully.");
	} 
}
