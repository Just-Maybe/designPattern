package com.example.helloworld.androiddesignpattern.factory;

/**
 * Created by helloworld on 2017/6/22.
 */

public class Client {
    public static void main(String[] args) {
        Factory factoryA = new ConcreteFactoryA();
        Factory factoryB = new ConcreteFactoryB();
        Product productA = factoryA.createProduct();
        Product productB = factoryB.createProduct();
        productA.method();
        productB.method();

        /**
         * 需要哪个对象就传入哪一个类的类型即可
         */
        Product p = factoryA.createProduct(ConcreteProductA.class);
    }
}
