package com.example.helloworld.androiddesignpattern.mediator;

import android.util.Log;

/**
 * Created by helloworld on 2017/6/13.
 */

public class GraphicsCard extends Colleague {

    public GraphicsCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 播放视频
     *
     * @param data
     */
    public void videoPlay(String data) {
        System.out.print("视频:" + data);
    }

}
