package com.example.helloworld.androiddesignpattern.observer;

import android.util.Log;

/**
 * Created by helloworld on 2017/6/6.
 */

public class Coder implements Observer {
    private String TAG = "Coder";
    String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object object) {
        Log.d(TAG, "Hi," + name + "Magazine更新了，内容:" + object);
    }
}
