package com.mybatis.datasource;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.apache.ibatis.datasource.DataSourceFactory;

// 使用自定义数据源
public class DbcpDataSourceFactory extends BasicDataSource implements DataSourceFactory{
	private Properties props = null;
	
	@Override
	public void setProperties(Properties props) {
		this.props = props;
	}

	@Override
	public DataSource getDataSource() {
		DataSource dataSource = null;
		
		try {
			dataSource = BasicDataSourceFactory.createDataSource(props);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataSource;
	}
	
}
