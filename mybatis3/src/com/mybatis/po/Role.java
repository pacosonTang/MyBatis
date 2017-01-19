package com.mybatis.po;

import org.apache.ibatis.type.Alias;

@Alias("role") // 自定义别名
public class Role {
	private Long id;
	private String roleName;
	private String note;
	
	public Role(Integer id, String name, String note) {
		this.id = new Long(id);
		this.roleName = name;
		this.note = note;
	}
	
	public Role(String name, String note) {
		this.roleName = name;
		this.note = note;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	@Override
	public String toString() {
		return "role name: " + roleName + ", note: " + note;
	}
}
