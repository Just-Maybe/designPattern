package com.example.helloworld.androiddesignpattern.factory;

/**
 * Created by helloworld on 2017/6/22.
 */

public class ConcreteFactoryB extends Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
