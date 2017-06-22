package com.example.helloworld.androiddesignpattern.abstractfactory;

/**
 * Created by helloworld on 2017/6/22.
 */

public abstract class AbstractFactory {
    /**
     * 创建产品A的方法
     *
     * @return 产品A对象
     */
    public abstract AbstractProductA createProductA();

    /**
     * 创建产品B 的方法
     *
     * @return 产品B对象
     */
    public abstract AbstractProductB createProductB();
}
