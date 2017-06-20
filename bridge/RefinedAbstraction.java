package com.example.helloworld.androiddesignpattern.bridge;

/**
 * Created by helloworld on 2017/6/20.
 */

public class RefinedAbstraction extends Abstraction {
    /**
     * 通过实现部分对象的引用构造抽象部分的对象
     *
     * @param mImplementor
     */
    public RefinedAbstraction(Implementor mImplementor) {
        super(mImplementor);
    }

    /**
     * 对父类抽象部分中的方法进行扩展
     */
    public void refinedOperation() {
        // 对Abstraction 中的方法进行扩展
    }
}
