package com.mybatis.main;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.enums.Sex;
import com.mybatis.mapper.PeopleMapper;
import com.mybatis.po.People;
import com.mybatis.util.SqlSessionFactoryUtil;

// »ùÓÚ People.
public class Main3_2 {
	static PeopleMapper mapper;
	
	public static void main(String[] args) {
		SqlSession session = SqlSessionFactoryUtil.openSqlSession();
		mapper = session.getMapper(PeopleMapper.class);
		
		int startup = 10000;
		for (int i = startup; i < startup+2; i++) {
			if(i%2==0)
				testInsertPeople(new People("man"+i,Sex.MALE,"hello world." + i));
			else
				testInsertPeople(new People("woman"+i,Sex.FEMALE,"hello world." + i));
		}
//		testSelectPeople(10L);
//		testDeletePeople(10L);
		session.commit();
		System.out.println("bingo.");
	}
	
	static void testInsertPeople(People People) {
		mapper.insertPeople(People);
		System.out.println("successful insertion.");
	}
	
	static void testSelectPeople(Long id) {
		mapper.getPeople(id);
		System.out.println("successful selection.");
	}
	
	static void testDeletePeople(Long id) {
		mapper.deletePeople(id);
		System.out.println("successful deleting.");
	}
}
