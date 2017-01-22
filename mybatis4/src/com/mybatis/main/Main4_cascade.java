package com.mybatis.main;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.mapper.PostMapper;
import com.mybatis.mapper.RoleMapper;
import com.mybatis.mapper.AuthorMapper;
import com.mybatis.mapper.UserMapper;
import com.mybatis.po.Post;
import com.mybatis.po.Author;
import com.mybatis.util.SqlSessionFactoryUtil;

public class Main4_cascade {
	static UserMapper userMapper;
	static RoleMapper roleMapper;
	static AuthorMapper authorMapper;
	static PostMapper postMapper;
	
	public static void main(String[] args) {
		SqlSession session = SqlSessionFactoryUtil.openSqlSession();
		userMapper = session.getMapper(UserMapper.class);
		roleMapper = session.getMapper(RoleMapper.class);
		authorMapper = session.getMapper(AuthorMapper.class);
		postMapper = session.getMapper(PostMapper.class);
		
//		testFindAuthorById(2);
//		testFindPostById(2);  // 一对一级联查询 
//		testFindPostlistByAuthorId(2);
		testFindAuthorById(2);
		session.commit(); // 千万不要忘记提交 sql 执行.
		System.out.println("bingo.");
	}
	static void testFindAuthorById(int authorId) { // 一对多级联查询 (collection)
		Author author = authorMapper.findAuthorById(authorId);
		System.out.println(authorId);
	}
	static void testFindPostlistByAuthorId(int authorId) {
		List<Post> list = postMapper.findPostlistByAuthorId(authorId);
		for(Post p: list)
			System.out.println(p);
	}
	static void testFindPostById(int id) { // 一对一 级联查询(association)
		Post post = postMapper.findPostById(id);
		System.out.println(post);
	}
}
