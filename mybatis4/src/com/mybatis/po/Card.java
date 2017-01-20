package com.mybatis.po;

import java.math.BigDecimal;

import org.apache.ibatis.type.Alias;

@Alias("card") // 自定义别名
public class Card {
	private int id;
	private String password;
	private double surplus;
	
	public Card(Integer id, String password, BigDecimal surplus) {
		this.id = id;
		this.password = password;
		this.surplus = surplus.doubleValue();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getSurplus() {
		return surplus;
	}
	public void setSurplus(double surplus) {
		this.surplus = surplus;
	}
	@Override
	public String toString() {
		return "Card [id=" + id + ", password=" + password + ", surplus=" + surplus + "]";
	}
}
