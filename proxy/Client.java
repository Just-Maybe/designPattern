package com.example.helloworld.androiddesignpattern.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by helloworld on 2017/6/13.
 */

public class Client {
    public static void main(String[] args) {
        //构造一个真实主题对象
        ILawsuit xiaomin = new XiaoMin();

        //通过真实主题对象构造一个代理对象
        ILawsuit lawyer = new Lawyer(xiaomin);

        //调用代理的相关方法
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
        /**
         * 静态代理
         *----------------------------------------
         * 动态代理
         * */
        //构造一个动态代理类
        DynamicProxy proxy = new DynamicProxy(xiaomin);
        //获取被代理类小明的ClassLoader
        ClassLoader loader = xiaomin.getClass().getClassLoader();
        // 动态构造一个代理者
        ILawsuit DynamicLawyer = (ILawsuit) Proxy.newProxyInstance(loader,new Class[]{ILawsuit.class},proxy);

        DynamicLawyer.submit();
        DynamicLawyer.burden();
        DynamicLawyer.defend();
        DynamicLawyer.finish();
    }
}
