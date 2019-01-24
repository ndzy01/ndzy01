package com.zhangyi05.java;

import javax.swing.*;
import java.awt.*;

/**
 * @author Zhang Yi
 * @create 2019- 01- 23- 10:18
 * @function
 */

public class Demo02 extends JFrame {


    MyPanel mp = null;
    public static void main(String[] args) {
    Demo02 demo02 = new Demo02();
    }
    public Demo02(){
        mp = new MyPanel();
        this.add(mp);

        this.setTitle("ndzy");//设置标题
        this.setSize(800,600);//设置大小
        this.setLocation(100,200);//设置初始位置
        this.setResizable(true);//控制缩放功能
        this.setVisible(true);//显示
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭

    }
}


//我的面板
class MyPanel extends  JPanel{
    //定义一个我的坦克
    MyTank myTank = null;
    public MyPanel(){
        myTank = new MyTank(10,10);
    }
    public void paint (Graphics g){

        super.paint(g);
        g.fillRect(0,0,800,600);
        //画坦克
        this.drawTank(myTank.getX(),myTank.getY(),g,0,1);


    }
    public void drawTank(int x,int y,Graphics g,int direct,int type ){
        //坦克类型
        switch (type){
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
        }

        //判断方向
        switch (direct){
            //向上
            case 0:
                g.fill3DRect(x,y,5,30,false);
                g.fill3DRect(x+15,y,5,30,false);
                g.fill3DRect(x+5,y+5,10,20,false);
                g.fillOval(x+5,y+10,10,10);
                g.drawLine(x+10,y+15,x+10,y-2);
            break;

        }
    }
}
//坦克类
class Tank{
    //坦克的坐标
       int x = 0;
       int y = 0;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public  Tank(int x, int y){
        this.x=x;
        this.y=y;
    }
}

class MyTank extends Tank{
    public MyTank(int x,int y){
        super(x,y);
    }

}
