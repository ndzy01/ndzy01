package com.test.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author Zhang Yi
 * @create 2019- 01- 24- 15:41
 * @function
 */

public class MyTankPanel extends JPanel implements KeyListener,Runnable {
    //定义我的坦克
    MyTank myTank = null;
    //定义敌方坦克组
    Vector<QTank01> ets = new Vector<QTank01>();
    int enSize = 3;

    public MyTankPanel() {
        myTank = new MyTank(200,200);
        myTank.setDirection(0);
        myTank.setType(0);
        //
        for (int i=0;i<enSize;i++){
            QTank01 qT = new QTank01((i+1)*100,0);
            qT.setColor(1);
            qT.setType(1);
            ets.add(qT);

        }
    }
    public void paint (Graphics g){
        super.paint(g);
        g.fillRect(0,0,800,600);

        //画我的坦克,朝上，红色
        if(myTank.z!=null&&myTank.z.isLive==true){
            g.setColor(Color.green);
            g.fill3DRect(myTank.z.x,myTank.z.y,5,5,false);
        }
        this.drawTank(myTank.getX(),myTank.getY(),g,myTank.getDirection(),myTank.getColor(),myTank.getType());
        for(int i=0;i<ets.size();i++){
            this.drawTank(ets.get(i).getX(),ets.get(i).getY(),g,ets.get(i).getDirection(),ets.get(i).getColor(),ets.get(i).getType());
        }

    }
    public void drawTank(int x,int y,Graphics g,int direct,int color,int type ){
        //坦克类型
        switch (color){
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
                if(type==0){
                g.fill3DRect(x,y,5,30,false);
                g.fill3DRect(x+15,y,5,30,false);
                g.fill3DRect(x+5,y+5,10,20,false);
                g.fillOval(x+5,y+10,10,10);
                g.drawLine(x+10,y+15,x+10,y-2);
                }else{
                    g.fill3DRect(x,y,5,30,false);
                    g.fill3DRect(x+15,y,5,30,false);
                    g.fill3DRect(x+5,y+5,10,20,false);
                    g.fillOval(x+5,y+10,10,10);
                    g.drawLine(x+10,y+15,x+10,y-5);
                }
                break;
            //向右
            case 1:
                if(type==0){
                g.fill3DRect(x,y,30,5,false);
                g.fill3DRect(x,y+15,30,5,false);
                g.fill3DRect(x+5,y+5,20,10,false);
                g.fillOval(x+9,y+5,10,10);
                g.drawLine(x+15,y+10,x+32,y+10);
                }else{
                    g.fill3DRect(x,y,30,5,false);
                    g.fill3DRect(x,y+15,30,5,false);
                    g.fill3DRect(x+5,y+5,20,10,false);
                    g.fillOval(x+9,y+5,10,10);
                    g.drawLine(x+15,y+10,x+35,y+10);
                }

                break;
            //向下
            case 2:
                if(type==0){
                g.fill3DRect(x,y,5,30,false);
                g.fill3DRect(x+15,y,5,30,false);
                g.fill3DRect(x+5,y+5,10,20,false);
                g.fillOval(x+5,y+10,10,10);
                g.drawLine(x+10,y+15,x+10,y+32);
                }else{
                    g.fill3DRect(x,y,5,30,false);
                    g.fill3DRect(x+15,y,5,30,false);
                    g.fill3DRect(x+5,y+5,10,20,false);
                    g.fillOval(x+5,y+10,10,10);
                    g.drawLine(x+10,y+15,x+10,y+35);
                }
                break;
            //
            case 3:
                if(type==0){
                g.fill3DRect(x,y,30,5,false);
                g.fill3DRect(x,y+15,30,5,false);
                g.fill3DRect(x+5,y+5,20,10,false);
                g.fillOval(x+9,y+5,10,10);
                g.drawLine(x+15,y+10,x-2,y+10);
                }else{
                    g.fill3DRect(x,y,30,5,false);
                    g.fill3DRect(x,y+15,30,5,false);
                    g.fill3DRect(x+5,y+5,20,10,false);
                    g.fillOval(x+9,y+5,10,10);
                    g.drawLine(x+15,y+10,x-5,y+10);
                }
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
        }else {
            }
    //**********************
        if(e.getKeyCode()== KeyEvent.VK_J){
        myTank.shot();
        }

        for(int i=0;i<ets.size();i++){
        if(e.getKeyCode()==KeyEvent.VK_W){
            ets.get(i).direction=2;
            ets.get(i).moveDowm();
        }else if(e.getKeyCode()==KeyEvent.VK_S){
            ets.get(i).direction=0;
            ets.get(i).moveUp();

        }else if(e.getKeyCode()==KeyEvent.VK_A){
            ets.get(i).direction=1;
            ets.get(i).moveRight();
        }else if(e.getKeyCode()==KeyEvent.VK_D){
            ets.get(i).direction=3;
            ets.get(i).moveLeft();
        }else{

        }
        }
        this.repaint();

    }
    public void keyReleased(KeyEvent e){

    }
    public  void keyTyped(KeyEvent e){

    }
    public void run(){
       while (true){
           try{
               Thread.sleep(100);
           }catch (InterruptedException e){
               e.printStackTrace();
           }
           this.repaint();
       }
}

}

