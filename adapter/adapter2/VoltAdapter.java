package com.example.helloworld.androiddesignpattern.adapter.adapter2;

/**
 * Created by helloworld on 2017/6/16.
 */

public class VoltAdapter implements FiveVolt {
    Volt220 mVolt220;

    public VoltAdapter(Volt220 adaptee) {
        this.mVolt220 = adaptee;
    }

    public int getVolt220(){
        return mVolt220.getVolt220();
    }

    @Override
    public int getVolt5() {
        return 0;
    }
}
