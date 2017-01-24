package com.mybatis.po;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

@Alias("Post") // 自定义别名
public class Post implements Serializable{
	private static final long serialVersionUID = 837749027072755884L;
	private int id;
	private String name;
	private String content;
	
	public Post() {}
	
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "Post [id=" + id + ", name=" + name + ", content=" + content + "]";
	}
}
