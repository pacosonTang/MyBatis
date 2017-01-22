package com.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mybatis.po.Post;

public interface PostMapper {
	Post findPostById(@Param("postId")int postId);
	
	List<Post> findPostlistByAuthorId(@Param("authorId")int authorId);
}
