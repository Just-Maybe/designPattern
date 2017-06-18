package com.example.helloworld.androiddesignpattern.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by helloworld on 2017/6/18.
 */

public class TicketFactory {
    static Map<String, Ticket> sTicketMap = new ConcurrentHashMap<>();

    public static Ticket getTicket(String from, String to) {
        String key = from + "-" + to;
        if (sTicketMap.containsKey(key)) {
            System.out.print("使用缓存-->" + key);
            return sTicketMap.get(key);
        } else {
            System.out.print("创建对象-->" + key);
            Ticket ticket = new TrainTicket(from, to);
            sTicketMap.put(key, ticket);
            return ticket;
        }
    }
}
