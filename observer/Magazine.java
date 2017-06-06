package com.example.helloworld.androiddesignpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by helloworld on 2017/6/6.
 */

public class Magazine implements Observable {
    List<Observer> observerList = new ArrayList<>();

    public boolean isUpdate() {
        return isUpdate;
    }

    public void setUpdate(boolean update) {
        isUpdate = update;
    }

    boolean isUpdate;

    public void postNewPublication(String content) {
        setChanged();
        notifyObservers(content);
    }

    private void setChanged() {
        if (isUpdate) {
            setUpdate(false);
        } else {
            setUpdate(true);
        }
    }

    @Override
    public void notifyObservers(Object object) {
        for (int i = 0; i < observerList.size(); i++) {
            observerList.get(0).update(this, object);
        }
    }

    @Override
    public void addObservers(Observer observer) {
        observerList.add(observer);
    }
}
