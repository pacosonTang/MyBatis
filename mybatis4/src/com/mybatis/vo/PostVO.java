package com.mybatis.vo;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import com.mybatis.po.Author;

//PostVO 是 Post对应的 view object 对象（表现层对象)
@Alias("PostVO") // 自定义别名
public class PostVO implements Serializable {
	private static final long serialVersionUID = 2501941095335053627L;
	private int id;
	private String name;
	private String content;
	private Author author;
	
	// 必须提供一个无参数的构造函数 和 Author 的 getter 和 setter 方法
	// 以实现级联查询.
	public PostVO() {}
	
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
