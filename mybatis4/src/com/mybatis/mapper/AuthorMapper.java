package com.mybatis.mapper;

import org.apache.ibatis.annotations.Param;

import com.mybatis.po.Author;
import com.mybatis.vo.AuthorVO;

public interface AuthorMapper {
	AuthorVO findAuthorVOById(@Param("authorId")int authorId); // 一对多的 colletion 级联 query
	Author findAuthorById(@Param("authorId")int authorId); // 仅仅查询出Author信息  不级联查询 post
}
