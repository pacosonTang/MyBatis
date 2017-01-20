package com.mybatis.po;

public class Card {
	private int id;
	private int stuId;
	
	public Card(int id, int stuId) {
		this.id = id;
		this.stuId = stuId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	@Override
	public String toString() {
		return "id = " + id + "stuId = " + stuId;
	}
}
