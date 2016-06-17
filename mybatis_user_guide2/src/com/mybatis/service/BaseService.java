package com.mybatis.service;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BaseService {
	protected static SqlSessionFactory sqlSessionFactory;
	
	public BaseService() {
		sqlSessionFactory = createSqlSessionFactory();
	}
	
	private static SqlSessionFactory createSqlSessionFactory() {
		if(sqlSessionFactory == null) {
			String resource = "mybatis-config.xml";
			InputStream inputStream = null;
			
			try {
				inputStream = Resources.getResourceAsStream(resource);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return new SqlSessionFactoryBuilder().build(inputStream);
		} else {
			return sqlSessionFactory;
		}
	}

	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
}
