package com.mybatis.params;

public class RoleParam {
	private String roleName;
	private String  note;
	
	public RoleParam(String roleName, String note) {
		this.roleName = roleName;
		this.note = note;
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
}
