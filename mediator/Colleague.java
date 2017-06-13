package com.example.helloworld.androiddesignpattern.mediator;

/**
 * Created by helloworld on 2017/6/13.
 */

public abstract class Colleague {
    protected Mediator mediator;    //每个同事都该知道其中介者

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }
}
