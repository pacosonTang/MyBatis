package com.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mybatis.po.User;

public interface UserMapper {
	User getUser(Long id);
	int insertUser(User user);
	int deleteUser(Long id);
	int countSurname(String surname);
	
	List<User> findUserBySex(@Param("sexlist") List<Integer> sexlist);
}
