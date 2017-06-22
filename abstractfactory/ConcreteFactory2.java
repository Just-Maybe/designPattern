package com.example.helloworld.androiddesignpattern.abstractfactory;

/**
 * Created by helloworld on 2017/6/22.
 */

public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB creteProductB() {
        return new ConcreteProductB2();
    }
}
