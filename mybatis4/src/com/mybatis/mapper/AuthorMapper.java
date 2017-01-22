package com.mybatis.mapper;

import org.apache.ibatis.annotations.Param;

import com.mybatis.po.Author;

public interface AuthorMapper {
	Author findAuthorById(@Param("authorId")int authorId);
}
