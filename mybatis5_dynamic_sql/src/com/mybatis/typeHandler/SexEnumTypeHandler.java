package com.mybatis.typeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import com.mybatis.enums.Sex;
// 自定义 枚举类型处理器
public class SexEnumTypeHandler implements TypeHandler<Sex>{
	private Logger log = Logger.getLogger(SexEnumTypeHandler.class.getSimpleName());
	
	@Override
	public void setParameter(PreparedStatement ps, int i, Sex parameter, JdbcType jdbcType) throws SQLException {
		log.info("使用我的 SexEnumTypeHandler");
		ps.setInt(i, parameter.getId());
	}

	@Override
	public Sex getResult(ResultSet rs, String columnName) throws SQLException {
		log.info("使用我的 SexEnumTypeHandler");
		int id = rs.getInt(columnName);
		return Sex.getSex(id);
	}

	@Override
	public Sex getResult(ResultSet rs, int columnIndex) throws SQLException {
		log.info("使用我的 SexEnumTypeHandler");
		int id = rs.getInt(columnIndex);
		return Sex.getSex(id);
	}

	@Override
	public Sex getResult(CallableStatement cs, int columnIndex) throws SQLException {
		log.info("使用我的 SexEnumTypeHandler");
		int id = cs.getInt(columnIndex);
		return Sex.getSex(id);
	}
}
