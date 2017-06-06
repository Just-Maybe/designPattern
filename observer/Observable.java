package com.example.helloworld.androiddesignpattern.observer;

/**
 * Created by helloworld on 2017/6/6.
 */

public interface Observable {
    void notifyObservers(Object object);
    void addObservers(Observer observer);
}
