package com.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mybatis.params.RoleParam;
import com.mybatis.po.Role;

public interface RoleMapper {
	List<Role> findRoleByIF(@Param("roleId")Integer roleId, @Param("roleName")String roleName);
	List<Role> findRoleByChoose(@Param("roleId")Integer roleId, @Param("roleName")String roleName);
	List<Role> findRoleByWhere(@Param("roleId")Integer roleId, @Param("roleName")String roleName);
	List<Role> findRoleByTrim(@Param("roleId")Integer roleId, @Param("roleName")String roleName);
	
	int updateRoleById(Role role);
	
	List<Role> findRoleByBind(@Param("singleParameter")String singleParameter);
}
