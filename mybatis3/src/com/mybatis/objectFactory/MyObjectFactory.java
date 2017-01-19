package com.mybatis.objectFactory;

import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

public class MyObjectFactory extends DefaultObjectFactory{

	private static final long serialVersionUID = -630157777533596671L;
	Logger log = Logger.getLogger(MyObjectFactory.class.getSimpleName());
	
	@Override
	public <T> T create(Class<T> type) {
		log.info("使用定制对象工厂的 create 方法 构建单个对象.");
		return super.create(type);
	}
	@Override
	public <T> T create(Class<T> type, List<Class<?>> constructorArgTypes, List<Object> constructorArgs) {
		log.info("使用定制对象工厂的 create 方法 构建单个对象.");
		return super.create(type, constructorArgTypes, constructorArgs);
	}
	@Override
	public void setProperties(Properties properties) {
		log.info("使用定制属性: " + properties);
		super.setProperties(properties);
	}
}
