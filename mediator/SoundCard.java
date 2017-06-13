package com.example.helloworld.androiddesignpattern.mediator;

/**
 * Created by helloworld on 2017/6/13.
 */

public class SoundCard extends Colleague {
    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 播放音频
     *
     * @param data
     */
    public void soundPlay(String data) {
        System.out.print("音频:" + data);
    }
}
