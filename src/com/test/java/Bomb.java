package com.test.java;

/**
 * @author Zhang Yi
 * @create 2019- 01- 25- 18:28
 * @function
 */

public class Bomb {
    //炸弹生命
    int life = 6;
    boolean isLive=true;
    int x=0;
    int y=0;
    public Bomb(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void lifeDown(){
        if(life>0){
            life--;
        }else {
            this.isLive=false;
        }
    }
}
