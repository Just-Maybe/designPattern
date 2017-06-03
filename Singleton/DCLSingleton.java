package com.example.helloworld.androiddesignpattern.Singleton;

/**
 * Created by helloworld on 2017/6/3.
 */

/**
 * Double Check Lock(DCL) 实现单例
 */
public class DCLSingleton {
    private static DCLSingleton sInstance = null;

    private DCLSingleton() {

    }

    public static DCLSingleton getInstance() {
        if (sInstance == null) {
            synchronized (DCLSingleton.class) {
                if (sInstance == null) {
                    sInstance = new DCLSingleton();
                }
            }
        }
        return sInstance;
    }
    /**
     * sInstance 的两次判断
     *  第一次:主要是为了避免不必要的同步
     *  第二次:为了在null的情况下创建实例
     *
     *  DCL的优点:资源利用高，第一次执行getInstance时单例对象才会被实例化
     *       缺点:第一次加载时反应稍慢，也由于Java内存模型的原因偶尔会失败
     *
     *  DCL 是使用最多的实例实现模式
     */

}
