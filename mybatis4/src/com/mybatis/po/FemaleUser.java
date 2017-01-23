package com.mybatis.po;

import org.apache.ibatis.type.Alias;

import com.mybatis.enums.Sex;

@Alias("FemaleUser") // 自定义别名
public class FemaleUser extends User{
}
