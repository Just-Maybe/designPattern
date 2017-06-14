package com.example.helloworld.androiddesignpattern.iterator;

/**
 * Created by helloworld on 2017/6/14.
 */

public abstract class AbstractRequest {
    private Object object;  //处理对象

    public AbstractRequest(Object object) {
        this.object = object;
    }

    /**
     * 获取处理的内容对象
     *
     * @return
     */
    public Object getContent() {
        return object;
    }

    /**
     * 获取请求级别
     *
     * @return 请求级别
     */
    protected abstract int getRequestLevel();
}
