package com.mybatis.mapper;

import java.util.List;

import com.mybatis.po.Role;

public interface RoleMapper {
	Role getRole(Long id);
	int deleteRole(Long id);
	int insertRole(Role role);
	List<Role> findRole(String roleName);
}
