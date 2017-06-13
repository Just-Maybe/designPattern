package com.example.helloworld.androiddesignpattern.proxy;

/**
 * Created by helloworld on 2017/6/13.
 */

public class XiaoMin implements ILawsuit {
    @Override
    public void submit() {
        System.out.print("申请");
    }

    @Override
    public void burden() {
        System.out.print("举证");
    }

    @Override
    public void defend() {
        System.out.print("辩护");
    }

    @Override
    public void finish() {
        System.out.print("诉讼成功!");
    }
}
