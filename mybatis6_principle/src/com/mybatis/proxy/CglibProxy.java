package com.mybatis.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {  
    private Object target;    
      
    public Object getProxyInstance(Object target) {    
        this.target = target;  
        Enhancer enhancer = new Enhancer();    
        enhancer.setSuperclass(this.target.getClass());    
        enhancer.setCallback(this);  // call back method, 回调方法
        return enhancer.create();  // create proxy instance, 创建代理实例  
    }    
      
    @Override  
    public Object intercept(Object target, Method method, Object[] args, MethodProxy proxy) throws Throwable {  
        System.out.println("before target method...");  
        Object result = proxy.invokeSuper(target, args);  
        System.out.println("after target method...");  
        return result;  
    }  
}  
