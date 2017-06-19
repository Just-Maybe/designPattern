package com.example.helloworld.androiddesignpattern.facade;

/**
 * Created by helloworld on 2017/6/19.
 */

public class Client {
    public static void maint(String[] args) {
        MobilePhone nexus6 = new MobilePhone();
        //拍照
        nexus6.takePicture();
        //视频聊天
        nexus6.videoChat();
    }
}
