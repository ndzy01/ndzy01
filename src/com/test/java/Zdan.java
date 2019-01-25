package com.test.java;

/**
 * @author Zhang Yi
 * @create 2019- 01- 25- 12:07
 * @function
 */
//子弹类
public class Zdan implements  Runnable {
    int x = 0;
    int y = 0;
    int speed=2;
    int direction=0;
    boolean isLive=true;

    public Zdan(int x,int y,int direction){
        this.x=x;
        this.y=y;
        this.direction=direction;
    }
    @Override
    public void run() {
    while (true) {
        try{
            Thread.sleep(50);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        switch (direction) {
            case 0:
                y -= speed;
                break;
            case 1:
                x += speed;
                break;
            case 2:
                y += speed;
                break;
            case 3:
                x -= speed;
                break;
        }
        //判断子弹到达边缘
        if(x<20||x>780||y>580){
            this.isLive=false;
            break;
        }
    }
    }


}
