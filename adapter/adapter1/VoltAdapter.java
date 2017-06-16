package com.example.helloworld.androiddesignpattern.adapter.adapter1;

/**
 * Created by helloworld on 2017/6/16.
 */

/**
 * // Adapter角色，将220的电压转换成5V的电压
 */
public class VoltAdapter extends Volt220 implements FiveVolt {
    @Override
    public int getVolt5() {
        return 5;
    }
}
