package com.example.helloworld.androiddesignpattern.memoto;

/**
 * Created by helloworld on 2017/6/12.
 */

public class Caretaker {
    Memoto mMemoto;  //备忘录

    /**
     * 存档
     * @param memoto
     */
    public void archive(Memoto memoto){
        this.mMemoto = memoto;
    }

    /**
     * 获取存档
     * @return
     */
    public Memoto getMemoto(){
        return this.mMemoto;
    }
}
