package com.example.helloworld.androiddesignpattern.proxy;

/**
 * Created by helloworld on 2017/6/13.
 */

public class Lawyer implements ILawsuit {
    private ILawsuit mLawsuit;   //持有真实主题的引用

    public Lawyer(ILawsuit mLawsuit) {
        this.mLawsuit = mLawsuit;
    }

    @Override
    public void submit() {
        mLawsuit.submit();
    }

    @Override
    public void burden() {
        mLawsuit.burden();
    }

    @Override
    public void defend() {
        mLawsuit.defend();
    }

    @Override
    public void finish() {
        mLawsuit.finish();
    }
}
