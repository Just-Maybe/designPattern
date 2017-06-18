package com.example.helloworld.androiddesignpattern.flyweight;

/**
 * Created by helloworld on 2017/6/18.
 */

public class Client {
    public static void main(String[] args){
        Ticket ticket01 = TicketFactory.getTicket("北京","青岛");
        ticket01.showTicketInfo("上铺");
        Ticket ticket02 = TicketFactory.getTicket("北京","青岛");
        ticket01.showTicketInfo("下铺");
        Ticket ticket03 = TicketFactory.getTicket("北京","青岛");
        ticket01.showTicketInfo("坐票");
    }
    /**
     * 运行结果:
     * 创建对象-->北京-青岛
     * 购物从北京到青岛的上铺火车票,价格:28
     * 使用缓存-->北京-青岛
     * 购物从北京到青岛的上铺火车票,价格:128
     * 使用缓存-->北京-青岛
     * 购物从北京到青岛的上铺火车票,价格:238
     */
}
