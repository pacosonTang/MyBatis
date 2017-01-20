package com.mybatis.po;

public class Student {
	private int id;
	private String name;
	private Card card;
	
	public Student(int id, String name, Card card) {
		this.id = id;
		this.name = name;
		this.card = card;
	}
	public Student(String name, Card card) {
		this.name = name;
		this.card = card;
	}
	public Student(String name){
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
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	@Override
	public String toString() {
		return "id = " + id + ", name = " + name + ", card = " + card;
	}
}
