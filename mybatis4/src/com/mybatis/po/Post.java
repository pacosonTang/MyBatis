package com.mybatis.po;

import org.apache.ibatis.type.Alias;

@Alias("Post") // 自定义别名
public class Post {
	private int id;
	private String name;
	private String content;
	private Author author;
	
	// 必须提供一个无参数的构造函数 和 Author 的 getter 和 setter 方法
	// 以实现级联查询.
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
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Post [id=" + id + ", name=" + name + ", content=" + content + ", author=" + author + "]";
	}
}
