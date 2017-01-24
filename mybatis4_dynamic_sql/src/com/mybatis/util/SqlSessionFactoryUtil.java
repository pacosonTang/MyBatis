package com.mybatis.util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// 单例模式创建 SqlSessionFactory.
public class SqlSessionFactoryUtil {
	private static SqlSessionFactory factory = null;
	private SqlSessionFactoryUtil() {}
	
	public static SqlSessionFactory getInstance() {
		String resource = "mybatis-config.xml";
		InputStream is = null;
		
		try {
			is = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		synchronized (SqlSessionFactory.class) {
			if(factory==null) {
				factory = new SqlSessionFactoryBuilder().build(is);
			}
		}
		return factory;
	}
	public static SqlSession openSqlSession() {
		if(factory == null) {
			factory = getInstance();
		}
		return factory.openSession();
	}
}
