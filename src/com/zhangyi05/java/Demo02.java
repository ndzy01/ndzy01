package com.zhangyi05.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author Zhang Yi
 * @create 2019- 01- 23- 10:18
 * @function
 */

public class Demo02 extends JFrame {


    Mypanel02 mp = null;
    public static void main(String[] args) {
    Demo02 demo02 = new Demo02();
    }
    public Demo02(){
        mp = new Mypanel02();
        this.add(mp);
        this.addKeyListener(mp);
        this.setTitle("ndzy");//设置标题
        this.setSize(800,600);//设置大小
        this.setLocation(100,200);//设置初始位置
        this.setResizable(true);//控制缩放功能
        this.setVisible(true);//显示
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭

    }
}


//我的面板
class Mypanel02 extends  JPanel implements KeyListener  {
    //定义一个我的坦克
    MyTank myTank = null;
    int x=10;
    int y=10;
    int d=0;
    public Mypanel02(){
        myTank = new MyTank(x,y);
    }
    public void paint (Graphics g){

        super.paint(g);
        g.fillRect(0,0,800,600);
        //画坦克
        this.drawTank(x,y,g,d,1);

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
            //向右
            case 1:
                g.fill3DRect(x,y,30,5,false);
                g.fill3DRect(x,y+15,30,5,false);
                g.fill3DRect(x+5,y+5,20,10,false);
                g.fillOval(x+9,y+5,10,10);
                g.drawLine(x+15,y+10,x+32,y+10);
                break;
            //向下
            case 2:
                g.fill3DRect(x,y,5,30,false);
                g.fill3DRect(x+15,y,5,30,false);
                g.fill3DRect(x+5,y+5,10,20,false);
                g.fillOval(x+5,y+10,10,10);
                g.drawLine(x+10,y+15,x+10,y+32);
                break;
            //
            case 3:
                g.fill3DRect(x,y,30,5,false);
                g.fill3DRect(x,y+15,30,5,false);
                g.fill3DRect(x+5,y+5,20,10,false);
                g.fillOval(x+9,y+5,10,10);
                g.drawLine(x+15,y+10,x-2,y+10);
                break;


        }
    }

    public void keyPressed(KeyEvent e){
        if(e.getKeyCode()==KeyEvent.VK_W){
            y=y-4;
            d=0;
        }else if(e.getKeyCode()==KeyEvent.VK_S){
            y=y+4;
            d=2;
        }else if(e.getKeyCode()==KeyEvent.VK_A){
            x=x-4;
            d=3;
        }else if(e.getKeyCode()==KeyEvent.VK_D){
            x=x+4;
            d=1;
        }else{

        }
        this.repaint();

    }
    public void keyReleased(KeyEvent e){

    }
    public  void keyTyped(KeyEvent e){

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
