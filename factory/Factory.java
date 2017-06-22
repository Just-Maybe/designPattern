package com.example.helloworld.androiddesignpattern.factory;

/**
 * Created by helloworld on 2017/6/22.
 */

public abstract class Factory {
    /**
     * 抽象工厂方法
     * 具体生产什么由子类实现
     *
     * @return 具体的产品对象
     */
    public abstract Product createProduct();
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
