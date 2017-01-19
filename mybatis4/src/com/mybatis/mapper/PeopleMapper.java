package com.mybatis.mapper;

import com.mybatis.po.People;

public interface PeopleMapper {
	People getPeople(Long id);
	int insertPeople(People People);
	int deletePeople(Long id);
}
