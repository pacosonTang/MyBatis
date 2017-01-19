package com.mybatis.po;

import org.apache.ibatis.type.Alias;

import com.mybatis.enums.Sex;

@Alias("user") // 自定义别名
public class User {
	private Long id;
	private String userName;
	private Sex sex;
	private String note;
	
	public User(String userName, Sex sex, String note) {
		this.userName = userName;
		this.sex = sex;
		this.note = note;
	}
	
	public User(Long id, String userName, Sex sex, String note) {
		this.id = id;
		this.userName = userName;
		this.sex = sex;
		this.note = note;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Sex getSex() {
		return sex;
	}
	public void setSex(Sex sex) {
		this.sex = sex;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
}
