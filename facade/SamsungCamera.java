package com.example.helloworld.androiddesignpattern.facade;

/**
 * Created by helloworld on 2017/6/19.
 */

public class SamsungCamera implements Camera{
    @Override
    public void open() {
        System.out.print("打开相机");
    }

    @Override
    public void takePicture() {
        System.out.print("拍照");
    }

    @Override
    public void close() {
        System.out.print("关闭相机");
    }
}
