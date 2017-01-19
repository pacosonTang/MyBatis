package com.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mybatis.params.RoleParam;
import com.mybatis.po.Role;

public interface RoleMapper {
	Role getRoleBySqlElement(Long id);
	
	Role getRole(Long id);
	int deleteRole(Long id);
	int insertRole(Role role);
	int insertRoleByAutoPrimaryKey(Role role);
	List<Role> findRole(String roleName);
	
	// chapter4: 方法2：使用注解方式传递
	public List<Role> findRoleByAnnotation(
			@Param("roleName")String roleName, @Param("note")String note);
	
	// 方法3：使用java bean 传递参数
	public List<Role> findRoleByParam(RoleParam roleParam);
	
	// mybatis 传递SQL 列名
	public List<String> findColumn(
			@Param("column") String column, @Param("table") String table);
}
