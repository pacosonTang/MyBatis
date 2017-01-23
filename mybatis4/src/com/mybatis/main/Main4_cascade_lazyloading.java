package com.mybatis.main;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mybatis.mapper.PostMapper;
import com.mybatis.mapper.RoleMapper;
import com.mybatis.mapper.AuthorMapper;
import com.mybatis.mapper.UserMapper;
import com.mybatis.po.Post;
import com.mybatis.util.SqlSessionFactoryUtil;
import com.mybatis.vo.AuthorVO;
import com.mybatis.vo.PostVO;

public class Main4_cascade_lazyloading {
	private SqlSession session;
	private UserMapper userMapper;
	private RoleMapper roleMapper;
	private AuthorMapper authorMapper;
	private PostMapper postMapper;
	
	@Before
	public void init() {
		session = SqlSessionFactoryUtil.openSqlSession();
		userMapper = session.getMapper(UserMapper.class);
		roleMapper = session.getMapper(RoleMapper.class);
		authorMapper = session.getMapper(AuthorMapper.class);
		postMapper = session.getMapper(PostMapper.class);
	}
	@After
	public void myFinal() {
		session.commit(); // 千万不要忘记提交 sql 执行.
		System.out.println("bingo.");
	}
	
	@Test
	// 通过 authorId 查询 AuthorVO（级联查询多个对应的Post）
	public void testFindAuthorVOByAuthorId() { // 一对多级联查询 (collection)
		AuthorVO authorVO = authorMapper.findAuthorVOById(2);
		System.out.println(authorVO);
	}
	@Test
	// 通过 authorId 查询 属于该authorId 的post list
	public void testFindPostlistByAuthorId() { // 通过authorId 查找 post 列表
		List<Post> list = postMapper.findPostlistByAuthorId(2);
		for(Post p: list)
			System.out.println(p);
	}
	@Test
	public void testFindPostVOByPostId() { // 一对一 级联查询(association)
		PostVO postVO = postMapper.findPostVOByPostId(2);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("after sleeping.....");
		System.out.println(postVO);
	}
}
