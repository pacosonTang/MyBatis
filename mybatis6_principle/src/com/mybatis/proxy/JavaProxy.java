package com.mybatis.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;  
import java.lang.reflect.Proxy; 

public class JavaProxy implements InvocationHandler{  
    private Object target;  
    public Object getProxyInstance(Object target){ // 构建代理实例 
        this.target = target;  
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),   
                target.getClass().getInterfaces(), this);  
    }  
      
    @Override  
    public Object invoke(Object proxy, Method method, Object[] args)  
            throws Throwable {// 通过代理调用方法
        Object result = null;  
        System.out.println("before target method...");  
        result = method.invoke(target, args);  
        System.out.println("after target method...");  
        return result;  
    }  
}  
