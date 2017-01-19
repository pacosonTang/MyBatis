package com.mybatis.main;

import org.apache.ibatis.session.SqlSession;
import com.mybatis.mapper.UserMapper;
import com.mybatis.po.User;
import com.mybatis.util.SqlSessionFactoryUtil;

// »ùÓÚ User
public class Main3_1 {
	static UserMapper mapper;
	
	public static void main(String[] args) {
		SqlSession session = SqlSessionFactoryUtil.openSqlSession();
		mapper = session.getMapper(UserMapper.class);
		
		/*for (int i = 0; i < 10; i++) {
			if(i%2==0)
				testInsertUser(new User("xiaofang"+i,Sex.MALE,"hello world." + i));
			else
				testInsertUser(new User("sun"+i,Sex.FEMALE,"hello world." + i));
		}*/
//		testSelectUser(10L);
		testDeleteUser(10L);
		session.commit();
		System.out.println("bingo.");
	}
	
	static void testInsertUser(User user) {
		mapper.insertUser(user);
		System.out.println("successful insertion.");
	}
	
	static void testSelectUser(Long id) {
		mapper.getUser(id);
		System.out.println("successful selection.");
	}
	
	static void testDeleteUser(Long id) {
		mapper.deleteUser(id);
		System.out.println("successful deleting.");
	}
}
