package com.example.helloworld.androiddesignpattern.adapter.adapter2;

/**
 * Created by helloworld on 2017/6/16.
 */

public class Client {
    public static void main(String[] args) {
        VoltAdapter adapter = new VoltAdapter(new Volt220());
        System.out.print("输出电压:" + adapter.getVolt5());
    }
}
