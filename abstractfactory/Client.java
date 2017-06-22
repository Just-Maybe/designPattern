package com.example.helloworld.androiddesignpattern.abstractfactory;

/**
 * Created by helloworld on 2017/6/22.
 */

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractFactory factory2 = new ConcreteFactory2();
        AbstractProductA productA1 = factory1.createProductA();
        AbstractProductB productB1 = factory1.createProductB();
        AbstractProductA productA2 = factory2.createProductA();
        AbstractProductB productB2 = factory2.createProductB();

        productA1.method();
        productA2.method();
        productB1.method();
        productB2.method();

    }
}
