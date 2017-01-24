package com.mybatis.enums;

public enum Sex {
	UNKNOWN(0,"Î´"), MALE(1,"ÄÐ"), FEMALE(2,"Å®");
	private int id;
	private String name;
	
	private Sex(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static Sex getSex(int id) {
		if(id==1) return MALE;
		else if(id==2) return FEMALE;
		else return null;
	}
}
