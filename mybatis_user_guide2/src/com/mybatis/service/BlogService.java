package com.mybatis.service;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.dao.BlogMapper;
import com.mybatis.model.Blog;

public class BlogService extends BaseService {
	private SqlSession session;
	
	public BlogService() {
		super();
		session = sqlSessionFactory.openSession();
	}
	
	public SqlSession openSession() {
		return sqlSessionFactory.openSession();
		// sqlSessionFactory 由 BaseService 创建.
	}
	
	public Blog selectBlogById() {
		
		// method2. strongly recommended.
		session = sqlSessionFactory.openSession(); 
		try {
			BlogMapper mapper = session.
					getMapper(BlogMapper.class);
			return mapper.selectBlog(1);			
		} finally {
			session.close();
		}
		
		/*try { // method1.
			Blog blog = session.selectOne("com.mybatis.dao.BlogMapper.selectBlog", 1);
			return mapper.selectBlog(1);
		} finally {
			session.close();
		}*/
		
	}
}
