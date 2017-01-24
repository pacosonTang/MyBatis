package com.mybatis.po;

import org.apache.ibatis.type.Alias;

import com.mybatis.enums.Sex;

@Alias("UnknownUser") // 自定义别名
public class UnknownUser extends User{
}
