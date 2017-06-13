package com.example.helloworld.androiddesignpattern.mediator;

/**
 * Created by helloworld on 2017/6/13.
 */

public class Client {
    /**
     * 一个中介者模式的例子
     *
     * 电脑主板作为中介驱动电脑的各个零部件
     *
     * @param args
     */
    public static void main(String[] args){
        //构造主板对象
        MainBoard mediator = new MainBoard();

        //分别构造各个零部件
        CDDevice cd = new CDDevice(mediator);
        CPU cpu = new CPU(mediator);
        GraphicsCard vc = new GraphicsCard(mediator);
        SoundCard sc = new SoundCard(mediator);

        //将各个零部件安装到主板
        mediator.setCdDevice(cd);
        mediator.setCpu(cpu);
        mediator.setGraphicsCard(vc);
        mediator.setSoundCard(sc);
        //完成后开始播放
        cd.load();
    }
}
