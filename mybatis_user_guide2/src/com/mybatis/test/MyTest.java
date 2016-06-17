package com.mybatis.test;

import org.junit.Test;

import com.mybatis.model.Blog;
import com.mybatis.service.BlogService;

public class MyTest {
	
	@Test
	public void test1() {
		BlogService service = new BlogService();
		Blog blog = service.selectBlogById();
		System.out.println(blog.getTitle());
	}
}
