package com.example.helloworld.androiddesignpattern.adapter.adapter1;

/**
 * Created by helloworld on 2017/6/16.
 */

public class Client {
    public static void main(String[] args){
        VoltAdapter adapter = new VoltAdapter();
        System.out.print("输出电压:" +adapter.getVolt5());
    }
}
