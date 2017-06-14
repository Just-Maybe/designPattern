package com.example.helloworld.androiddesignpattern.iterator;

/**
 * Created by helloworld on 2017/6/14.
 */

public abstract class AbstractHandler {
    protected AbstractHandler nextHandler;  //下一节点上的处理者对象

    /**
     * 处理请求
     *
     * @param request  请求对象
     */
    public final void handlerRequest(AbstractRequest request){
        if(getHandleLevel()==request.getRequestLevel()){
            //一致则由该处理对象处理
            handle(request);
        }else {
            //否则将该请求对象转发给下一个节点上的请求对象
            if(nextHandler!=null){
                nextHandler.handlerRequest(request);
            }else {
                System.out.print("All of handler can not handle the request!");
            }
        }
    }

    /**
     * 获取处理者对象的处理级别
     *
     * @return
     */
    protected abstract int getHandleLevel();

    /**
     * 每个处理者的具体处理方式
     *
     * @param request
     */
    protected abstract void handle(AbstractRequest request);

}
