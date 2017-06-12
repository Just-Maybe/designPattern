package com.example.helloworld.androiddesignpattern.memoto;

/**
 * Created by helloworld on 2017/6/12.
 */

public class Client {
    public static void main(String[] args) {
        //构建游戏对象
        CallOfDuty game = new CallOfDuty();
        game.play();    //打游戏

        Caretaker caretaker = new Caretaker();
        caretaker.archive(game.createMemoto());//   游戏存档
        game.quit();    //退出游戏
        CallOfDuty newGame = new CallOfDuty();  //恢复游戏
        newGame.restore(caretaker.getMemoto());
    }
}
