package com.example.helloworld.androiddesignpattern.memoto;

/**
 * Created by helloworld on 2017/6/12.
 */

public class Memoto {
    public int mCheckpoint;
    public int mLifeValue;
    public String mWeapon;

    @Override
    public String toString() {
        return "CallOfDuty[mCheckpoint=" + mCheckpoint + ", mLifeValue=" + mLifeValue + ", mWeapon=" + mWeapon + "]";
    }
}
