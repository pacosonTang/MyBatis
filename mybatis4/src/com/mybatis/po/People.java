package com.mybatis.po;

import org.apache.ibatis.type.Alias;

import com.mybatis.enums.Sex;

// EnumTypeHandler 的测试用例
@Alias("people") // 自定义别名
public class People {
	private Long id;
	private String peopleName;
	private Sex sex;
	private String note;
	
	public People(String peopleName, Sex sex, String note) {
		this.peopleName = peopleName;
		this.sex = sex;
		this.note = note;
	}
	
	public People(Long id, String peopleName, Sex sex, String note) {
		this.id = id;
		this.peopleName = peopleName;
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
		return peopleName;
	}
	public void setUserName(String peopleName) {
		this.peopleName = peopleName;
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
