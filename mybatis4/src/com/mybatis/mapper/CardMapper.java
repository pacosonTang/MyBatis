package com.mybatis.mapper;

import org.apache.ibatis.annotations.Param;

import com.mybatis.po.Card;

public interface CardMapper {
	Card findCardByCardId(@Param("cardId")int cardId);
}
