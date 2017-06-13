package com.example.helloworld.androiddesignpattern.observer;

/**
 * Created by helloworld on 2017/6/6.
 */

public class Client {
    public static void main(String[] args){
        //被观察者
        Magazine magazine = new Magazine();
        //观察者
        Coder coder1 = new Coder("coder-1");
        Coder coder2 = new Coder("coder-2");
        Coder coder3 = new Coder("coder-3");
        magazine.addObservers(coder1);
        magazine.addObservers(coder2);
        magazine.addObservers(coder3);

        magazine.postNewPublication("新的一期杂志发布了...");
    }
}
