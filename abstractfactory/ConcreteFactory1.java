package com.example.helloworld.androiddesignpattern.abstractfactory;

/**
 * Created by helloworld on 2017/6/22.
 */

public class ConcreteFactory1 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB creteProductB() {
        return new ConcreteProductB1();
    }
}
