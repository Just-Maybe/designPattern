package com.example.helloworld.androiddesignpattern.Singleton;

/**
 * Created by helloworld on 2017/6/3.
 */

public class Singleton1 {
    private Singleton1(){}
    public static Singleton1 getInstance(){
        return SingletonHolder.sInstance;
    }

    /**
     * 静态内部类
     */
    private static class SingletonHolder{
        private static final Singleton1 sInstance = new Singleton1();
    }

    /**
     * 当第一次加载Singleton类时并不会初始化sInstance，只有在第一次调用Singleton的getInstance方法时才导致sInstance初始化.
     * 因此，第一次调用getInstance方法会导致虚拟机加载SingletonHolder类。
     * 这种方式不仅能确保线程安全，也能够保证单例对象的唯一性，同时也延迟了单例的实例化。
     *
     * 这个是推荐使用的单例模式实现方式
     */
}
