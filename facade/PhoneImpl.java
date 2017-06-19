package com.example.helloworld.androiddesignpattern.facade;

/**
 * Created by helloworld on 2017/6/19.
 */

public class PhoneImpl implements Phone {
    @Override
    public void dail() {
        System.out.print("打电话");
    }

    @Override
    public void hangup() {
        System.out.print("挂断!");
    }
}
