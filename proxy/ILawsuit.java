package com.example.helloworld.androiddesignpattern.proxy;

/**
 * Created by helloworld on 2017/6/13.
 */

public interface ILawsuit {
    //提交申请
    void submit();

    //进行举证
    void burden();

    //开始辩护
    void defend();

    //诉讼完成
    void finish();

}
