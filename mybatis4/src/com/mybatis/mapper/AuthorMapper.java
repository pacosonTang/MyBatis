package com.mybatis.mapper;

import org.apache.ibatis.annotations.Param;

import com.mybatis.po.Author;

public interface AuthorMapper {
	Author findAuthorById(@Param("authorId")int authorId); // 一对多的 colletion 级联 query
}
