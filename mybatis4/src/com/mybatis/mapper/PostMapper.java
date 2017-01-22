package com.mybatis.mapper;

import org.apache.ibatis.annotations.Param;

import com.mybatis.po.Post;

public interface PostMapper {
	Post findPostById(@Param("postId")int postId);
}
