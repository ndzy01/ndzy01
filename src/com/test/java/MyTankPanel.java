package com.test.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author Zhang Yi
 * @create 2019- 01- 24- 15:41
 * @function
 */

public class MyTankPanel extends JPanel implements KeyListener {
    MyTank myTank = null;
    QTank01 qTank01 = null;

    public MyTankPanel() {
        myTank = new MyTank(200,200);
        myTank.setDirection(0);
        myTank.setType(0);
        //
        qTank01 = new QTank01(400,300);
        qTank01.setDirection(0);
        qTank01.setType(1);
    }
    public void paint (Graphics g){
        super.paint(g);
        g.fillRect(0,0,800,600);

        //画我的坦克,朝上，红色
        this.drawTank(myTank.getX(),myTank.getY(),g,myTank.getDirection(),myTank.getType());
        this.drawTank(qTank01.getX(),qTank01.getY(),g,qTank01.getDirection(),qTank01.getType());


    }
    public void drawTank(int x,int y,Graphics g,int direct,int type ){
        //坦克类型
        switch (type){
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.red);
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
            myTank.direction=0;
            myTank.moveUp();
        }else if(e.getKeyCode()==KeyEvent.VK_S){
            myTank.direction=2;
            myTank.moveDowm();
        }else if(e.getKeyCode()==KeyEvent.VK_A){
            myTank.direction=3;
            myTank.moveLeft();
        }else if(e.getKeyCode()==KeyEvent.VK_D){
            myTank.direction=1;
            myTank.moveRight();
        }else{
        }
        if(e.getKeyCode()==KeyEvent.VK_W){
            qTank01.direction=2;
            qTank01.moveDowm();
        }else if(e.getKeyCode()==KeyEvent.VK_S){
            qTank01.direction=0;
            qTank01.moveUp();

        }else if(e.getKeyCode()==KeyEvent.VK_A){
            qTank01.direction=1;
            qTank01.moveRight();
        }else if(e.getKeyCode()==KeyEvent.VK_D){
            qTank01.direction=3;
            qTank01.moveLeft();
        }else{

        }
        this.repaint();

    }
    public void keyReleased(KeyEvent e){

    }
    public  void keyTyped(KeyEvent e){

    }


}

