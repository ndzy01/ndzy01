package com.test.java;

/**
 * @author Zhang Yi
 * @create 2019- 01- 24- 15:17
 * @function
 */

public class Tank {
    //构造函数
    public  Tank(int x, int y){
        this.x=x;
        this.y=y;

    }
    //坦克初始坐标
    int x=100;
    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    int y=100;

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }


    //坦克初始速度
    int speed=20;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
    //坦克颜色
    int color = 0;

    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    //坦克类型
    int type=0;

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    //坦克初始朝向
    //0朝上, 1朝右，2朝下，3朝左
    int direction=0;
    public void setDirection(int direction){
        this.direction = direction;
    }

    public int getDirection() {
        return direction;
    }

    //坦克走向
    //朝上
    public void moveUp(){
        y-=speed;
    }
    //朝右
    public void moveRight(){
        x+=speed;
    }
    //朝下
    public void moveDowm(){
        y+=speed;
    }
    //朝左
    public void moveLeft(){
        x-=speed;
    }
}
class MyTank extends Tank{
    public MyTank(int x,int y){
        super(x,y);
 }
}
class  QTank01 extends Tank{
    public QTank01(int x,int y) {
        super(x, y);
    }

}