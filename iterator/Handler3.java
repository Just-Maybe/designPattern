package com.example.helloworld.androiddesignpattern.iterator;

/**
 * Created by helloworld on 2017/6/14.
 */

public class Handler3 extends AbstractHandler {
    @Override
    protected int getHandleLevel() {
        return 3;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.print("Handler3 handle request:" + request.getRequestLevel());
    }
}
