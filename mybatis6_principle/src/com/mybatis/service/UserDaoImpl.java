package com.mybatis.service;

public class UserDaoImpl implements UserDao {

	@Override
	public void login(String username, String password) {
		System.out.println("username = " + username + ", password = " + password);
	} 
}
