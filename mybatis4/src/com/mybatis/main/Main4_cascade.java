package com.mybatis.main;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.mapper.PostMapper;
import com.mybatis.mapper.RoleMapper;
import com.mybatis.mapper.AuthorMapper;
import com.mybatis.mapper.UserMapper;
import com.mybatis.po.Post;
import com.mybatis.util.SqlSessionFactoryUtil;
import com.mybatis.vo.AuthorVO;
import com.mybatis.vo.PostVO;

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
		
//		testFindPostlistByAuthorId(2); // bingo.
//		testFindAuthorVOByAuthorId(2); // bingo.
		testFindPostVOByPostId(3);  // bingo.
		session.commit(); // 千万不要忘记提交 sql 执行.
		System.out.println("bingo.");
	}
	// 通过 authorId 查询 AuthorVO（级联查询多个对应的Post）
	static void testFindAuthorVOByAuthorId(int authorId) { // 一对多级联查询 (collection)
		AuthorVO authorVO = authorMapper.findAuthorVOById(authorId);
		System.out.println(authorVO);
	}
	// 通过 authorId 查询 属于该authorId 的post list
	static void testFindPostlistByAuthorId(int authorId) { // 通过authorId 查找 post 列表
		List<Post> list = postMapper.findPostlistByAuthorId(authorId);
		for(Post p: list)
			System.out.println(p);
	}
	// 
	static void testFindPostVOByPostId(int id) { // 一对一 级联查询(association)
		PostVO postVO = postMapper.findPostVOByPostId(id);
		System.out.println(postVO);
	}
}
