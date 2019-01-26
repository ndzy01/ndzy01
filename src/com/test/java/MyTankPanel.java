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
    int enSize = 5;
    Vector<Bomb> bombs = new Vector<Bomb>();
    //定义三张图片
    Image image1=null;
    Image image2=null;
    Image image3=null;

    public MyTankPanel() {
        myTank = new MyTank(200,200);
        myTank.setSpeed(10);
        myTank.setDirection(0);
        myTank.setType(0);
        //
        for (int i=0;i<enSize;i++){
            QTank01 qT = new QTank01((i+1)*100,200);
            qT.setColor(1);
            qT.setType(1);
            Thread t= new Thread(qT);
            t.start();
            Zdan z =new Zdan(qT.x+8,qT.y-5,0);
            //
            qT.ss01.add(z);
            Thread t1= new Thread(z);
            t1.start();
            ets.add(qT);
        }
        //初始化图片
        image1=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/3.jpg"));
        image2=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/2.jpg"));
        image3=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/1.jpg"));

    }
    public void tk_zd(Zdan z,QTank01 qt){
        //判断子弹是否击中坦克
        //判断坦克方向
        switch (qt.direction){
            case 0:
                if(z.x>=qt.x&&z.x<=qt.x+20&&z.y>=qt.y&&z.y<=qt.y+30){
                    //子弹死亡，敌方坦克死亡
                    z.isLive=false;
                    qt.isLive=false;
                    //创建一个炸弹，放在bombs中
                    Bomb b = new Bomb(qt.x,qt.y);
                    bombs.add(b);
                }
                break;
            case 1:
                if(z.x>=qt.x&&z.x<=qt.x+30&&z.y>=qt.y&&z.y<=qt.y+20){
                    //子弹死亡，敌方坦克死亡
                    z.isLive=false;
                    qt.isLive=false;
                    Bomb b = new Bomb(qt.x,qt.y);
                    bombs.add(b);
                }
                break;
            case 2:
                if(z.x>=qt.x&&z.x<=qt.x+20&&z.y>=qt.y&&z.y<=qt.y+30){
                    //子弹死亡，敌方坦克死亡
                    z.isLive=false;
                    qt.isLive=false;
                    Bomb b = new Bomb(qt.x,qt.y);
                    bombs.add(b);
                }
                break;
            case 3:
                if(z.x>=qt.x&&z.x<=qt.x+30&&z.y>=qt.y&&z.y<=qt.y+20){
                    //子弹死亡，敌方坦克死亡
                    z.isLive=false;
                    qt.isLive=false;
                    Bomb b = new Bomb(qt.x,qt.y);
                    bombs.add(b);
                }
                break;
        }


    }
    public void paint (Graphics g){
        super.paint(g);
        g.fillRect(0,0,800,600);

        //画我的坦克,朝上，红色
        for(int i=0;i<this.myTank.ss.size();i++) {
            Zdan zd = myTank.ss.get(i);
            if (zd != null && zd.isLive == true) {
                g.setColor(Color.green);
                g.fill3DRect(zd.x, zd.y, 5, 5, false);
            }
            if(zd.isLive==false){
                //把子弹从，子弹组里移除
                myTank.ss.remove(zd);
            }

        }

       //画炸弹
        for(int i=0;i<bombs.size();i++){
            Bomb b = bombs.get(i);
            if(b.life>4){
                g.drawImage(image1,b.x,b.y,30,30,this);
            }else if(b.life>2){
                g.drawImage(image2,b.x,b.y,30,30,this);
            }else{
                g.drawImage(image3,b.x,b.y,30,30,this);
            }
            b.lifeDown();
            if(b.life==0){
                bombs.remove(b);
            }
        }

        //画我的坦克
        this.drawTank(myTank.getX(),myTank.getY(),g,myTank.getDirection(),myTank.getColor(),myTank.getType());
        //画敌方坦克
        for(int i=0;i<ets.size();i++) {
            QTank01 qt = ets.get(i);
            if (qt.isLive) {
                this.drawTank(qt.getX(), qt.getY(), g, qt.getDirection(), qt.getColor(), ets.get(i).getType());
                //画子弹
                for(int j=0;j<qt.ss01.size();j++){
                  //
                  Zdan zd=qt.ss01.get(j);
                  if(zd.x<20||zd.y<20||zd.x>780||zd.y>580){
                      zd.isLive=false;
                  }


                  if(zd.isLive){
                      g.setColor(Color.red);
                      g.fill3DRect(zd.x, zd.y, 5, 5, false);
                  }else{
                      qt.ss01.remove(zd);
                  }
                  Thread t = new Thread(zd);
                  t.start();
                  }
                }
            }

    }
    //定义一个画坦克的函数drawTank
    public void drawTank(int x,int y,Graphics g,int direct,int color,int type ){
        //坦克颜色
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

    //实现接口
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
        if(e.getKeyCode()== KeyEvent.VK_J){

            //坦克只能发6发子弹
            if(this.myTank.ss.size()<=100) {
                myTank.shot();
            }
        }
        this.repaint();
    }
    public void keyReleased(KeyEvent e){

    }
    public  void keyTyped(KeyEvent e){

    }

    //实现接口
    public void run(){
       while (true){
           try{
               Thread.sleep(100);
           }catch (InterruptedException e){
               e.printStackTrace();
           }

           //判断是否击中
           for(int i= 0;i<myTank.ss.size();i++){
               Zdan zd = myTank.ss.get(i);
               //判断子弹是否有效
               if(zd.isLive){
                   //取出每个坦克与之匹配
                    for(int j=0;j<ets.size();j++){
                        //取出坦克
                        QTank01 qt = ets.get(j);
                        if( qt.isLive){
                            this.tk_zd(zd,qt);
                        }
                    }
               }
           }
           //重绘
           this.repaint();
       }
    }
}

