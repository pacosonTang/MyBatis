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
import com.mybatis.vo.PostVO;

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
	public void testFindPostVOByPostId() { // 一对多级联查询 (collection)
		PostVO postVO = postMapper.findPostVOByPostId(2);
		postVO = postMapper.findPostVOByPostId(2);
		System.out.println(postVO);
		System.out.println("1st SqlSession = " + session.hashCode());
		session.commit();
		System.out.println("1st SqlSession = " + session.hashCode());
		System.out.println("=== seperator line ===");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		session = SqlSessionFactoryUtil.openSqlSession();
		postMapper = session.getMapper(PostMapper.class);
		postVO = postMapper.findPostVOByPostId(2);
		System.out.println("2nd SqlSession = " + session.hashCode());
		System.out.println(postVO);
	}
}
