package com.mybatis.mapper;

import com.mybatis.po.Role;

public interface RoleMapper {
	Role getRole(Long id);
	int deleteRole(Long id);
	int insertRole(Role role);
}
