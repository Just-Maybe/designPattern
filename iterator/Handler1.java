package com.example.helloworld.androiddesignpattern.iterator;

/**
 * Created by helloworld on 2017/6/14.
 */

public class Handler1 extends AbstractHandler {
    @Override
    protected int getHandleLevel() {
        return 1;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.print("Handler1 handle request:" + request.getRequestLevel());
    }
}
