package com.mybatis.po;

import org.apache.ibatis.type.Alias;

import com.mybatis.enums.Sex;

@Alias("MaleUser") // 自定义别名
public class MaleUser extends User{
}
