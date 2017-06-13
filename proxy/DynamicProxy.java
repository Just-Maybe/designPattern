package com.example.helloworld.androiddesignpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by helloworld on 2017/6/13.
 */

public class DynamicProxy implements InvocationHandler {
    private Object object;   //被代理的类引用

    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(object,args);
        return result;
    }
}
