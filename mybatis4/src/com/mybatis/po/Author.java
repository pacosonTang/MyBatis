package com.mybatis.po;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

@Alias("Author") // 自定义别名
public class Author implements Serializable{
	private static final long serialVersionUID = 7911172396199243350L;
	private int id;
	private String name;
	
	// 必须提供一个无参数的构造函数
	public Author() {}
	
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

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + "]";
	}
}
