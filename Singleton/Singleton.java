package com.example.helloworld.androiddesignpattern.Singleton;

/**
 * Created by helloworld on 2017/6/3.
 */

public class Singleton {
    private static Singleton singleton = null;

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    private Singleton() {
    }
    /**
     * 懒汉式
     *  优点:单例只有在使用时才会被实例化，在一定程度上节约了资源
     *  缺点:缺点是第一次加载时需要及时进行实例化，反应稍慢。
     *      每次调用getInstance 都进行同步，造成不必要的同步开销。
     *
     * 这种模式一般不建议使用
     */
}
