package com.mybatis.po;

import org.apache.ibatis.type.Alias;

@Alias("student") // 自定义别名
public class Student {
	private int id;
	private String name;
	private Card card;
	
	public Student(Integer id, String name, Card card) {
		this.id = id;
		this.name = name;
		this.card = card;
	}
	public Student(String name, Card card) {
		this.name = name;
		this.card = card;
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
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", card=" + card + "]";
	}
}
