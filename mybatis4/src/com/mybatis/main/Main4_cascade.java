package com.mybatis.main;

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
		testFindPostById(2);  // 一对一级联查询 
		session.commit(); // 千万不要忘记提交 sql 执行.
		System.out.println("bingo.");
	}
	static void testFindAuthorById(int id) {
		Author author = authorMapper.findAuthorById(id);
		System.out.println(author);
	}
	static void testFindPostById(int id) {
		Post post = postMapper.findPostById(id);
		System.out.println(post);
	}
}
