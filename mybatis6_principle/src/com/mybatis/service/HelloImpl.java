package com.mybatis.service;

public class HelloImpl implements Hello{
	
	@Override  
    public void sayHello(String name) {  
        System.out.println("name = " + name);  
    } 
}
