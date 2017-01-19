package com.mybatis.databaseIdProvider;

import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.mapping.DatabaseIdProvider;

public class MyDatabaseIdProvider implements DatabaseIdProvider{
	private Properties props = null;
	
	@Override
	public void setProperties(Properties p) {
		this.props = p;
	}

	@Override
	public String getDatabaseId(DataSource dataSource) throws SQLException {
		String dbname = dataSource.getConnection().getMetaData().getDatabaseProductName();
		String dbId = (String)this.props.get(dbname);
		return dbId;
	}
}
