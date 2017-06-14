package com.example.helloworld.androiddesignpattern.iterator;

/**
 * Created by helloworld on 2017/6/14.
 */

public class Handler2 extends AbstractHandler {
    @Override
    protected int getHandleLevel() {
        return 2;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.print("Handler2 handle request:" + request.getRequestLevel());
    }
}
