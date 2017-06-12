package com.example.helloworld.androiddesignpattern.memoto;

import android.util.Log;

/**
 * Created by helloworld on 2017/6/12.
 */

public class CallOfDuty {
    private static final String TAG = "111";
    private int mCheckpoint = 1;
    private int mLifeValue = 100;
    private String mWeapon = "Ak-47";

    /**
     * 改变游戏属性
     */
    public void play() {
        mLifeValue -= 10;
        mCheckpoint++;
    }

    /**
     * 退出游戏
     */
    public void quit() {
        Log.d(TAG, "-------------------------");
        Log.d(TAG, "当前游戏属性" + this.toString());
        Log.d(TAG, "退出游戏");
        Log.d(TAG, "-------------------------");
    }

    /**
     * 创建备忘录
     *
     * @return
     */
    public Memoto createMemoto() {
        Memoto memoto = new Memoto();
        memoto.mCheckpoint = mCheckpoint;
        memoto.mLifeValue = mLifeValue;
        memoto.mWeapon = mWeapon;
        return memoto;
    }

    /**
     * 恢复游戏
     *
     * @param memoto
     */
    public void restore(Memoto memoto) {
        this.mCheckpoint = memoto.mCheckpoint;
        this.mLifeValue = memoto.mLifeValue;
        this.mWeapon = memoto.mWeapon;
    }

    @Override
    public String toString() {
        return "CallOfDuty[mCheckpoint=" + mCheckpoint + ", mLifeValue=" + mLifeValue + ", mWeapon=" + mWeapon + "]";
    }
}

