package com.mybatis.mapper;

import com.mybatis.po.User;

public interface UserMapper {
	User getUser(Long id);
	int insertUser(User user);
	int deleteUser(Long id);
}
