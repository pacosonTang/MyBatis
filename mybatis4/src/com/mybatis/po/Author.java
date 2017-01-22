package com.mybatis.po;

import java.util.List;

import org.apache.ibatis.type.Alias;

@Alias("Author") // 自定义别名
public class Author {
	private int id;
	private String name;
	private List<Post> postlist;
	
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

	public List<Post> getPostlist() {
		return postlist;
	}

	public void setPostlist(List<Post> postlist) {
		this.postlist = postlist;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + "]";
	}
}
