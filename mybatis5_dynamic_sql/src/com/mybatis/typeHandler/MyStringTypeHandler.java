package com.mybatis.typeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

@MappedTypes({String.class})
@MappedJdbcTypes(JdbcType.VARCHAR)
public class MyStringTypeHandler implements TypeHandler<String>{
	private Logger log = Logger.getLogger(MyStringTypeHandler.class.getSimpleName());
	
	@Override
	public void setParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType) throws SQLException {
		log.info("使用我的 TypeHandler");
		ps.setString(i, parameter);
	}

	@Override
	public String getResult(ResultSet rs, String columnName) throws SQLException {
		log.info("使用我的 TypeHandler, ResultSet 列名获取 字符串!");
		return rs.getString(columnName);
	}

	@Override
	public String getResult(ResultSet rs, int columnIndex) throws SQLException {
		log.info("使用我的Typehandler, ResultSet 下标获取字符串");
		return rs.getString(columnIndex);
	}

	@Override
	public String getResult(CallableStatement cs, int columnIndex) throws SQLException {
		log.info("使用我的 TypeHandler， CallableStatement 下标获取字符串.");
		return cs.getString(columnIndex);
	}
}
