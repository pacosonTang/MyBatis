package com.mybatis.main;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mybatis.mapper.AuthorMapper;
import com.mybatis.mapper.PostMapper;
import com.mybatis.mapper.RoleMapper;
import com.mybatis.mapper.UserMapper;
import com.mybatis.util.SqlSessionFactoryUtil;
import com.mybatis.vo.AuthorVO;

public class Main4_cache {
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
}
