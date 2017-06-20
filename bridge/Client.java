package com.example.helloworld.androiddesignpattern.bridge;

/**
 * Created by helloworld on 2017/6/20.
 */

public class Client {
    public static void main(String[] args){
        Implementor implementor =new ConcreteImplementorA();
        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.operation();
    }
}
