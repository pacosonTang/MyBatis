package com.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mybatis.po.Post;
import com.mybatis.vo.PostVO;

public interface PostMapper {
	PostVO findPostVOByPostId(@Param("postId")int postId);
	
	List<Post> findPostlistByAuthorId(@Param("authorId")int authorId);
}
