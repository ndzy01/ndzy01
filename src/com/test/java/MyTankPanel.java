package com.test.java;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.Vector;

/**
 * @author Zhang Yi
 * @create 2019- 01- 24- 15:41
 * @function
 */

public class MyTankPanel extends JPanel implements KeyListener,Runnable {
    //定义我的坦克组
    Vector<MyTank> ets00 = new Vector<MyTank>();
    //定义敌方坦克组
    Vector<QTank01> ets = new Vector<QTank01>();

    int enSize = 5;
    Vector<Bomb> bombs = new Vector<Bomb>();
    //定义三张图片
    Image image1=null;
    Image image2=null;
    Image image3=null;

    public MyTankPanel() {
        for (int i=0;i<1;i++){
            MyTank myTank = new MyTank(200,300);
            myTank.setColor(0);
            myTank.setType(0);
            Thread my_t1= new Thread(myTank);
            my_t1.start();
            Zdan z =new Zdan(myTank.x+8,myTank.y-2,0);
            //
            ets00.add(myTank);
        }

        for (int i=0;i<enSize;i++){
            QTank01 qT = new QTank01((i+1)*100,200);
            qT.setColor(1);
            qT.setType(1);
            Thread t1= new Thread(qT);
            t1.start();
            Zdan z =new Zdan(qT.x+8,qT.y-5,0);
            //
            qT.ss01.add(z);
            Thread t2= new Thread(z);
            t2.start();
            ets.add(qT);
        }
        //初始化图片

        try{
            image1 =ImageIO.read(new File("D:\\ndzy\\src\\3.jpg"));
            image2 =ImageIO.read(new File("D:\\ndzy\\src\\3.jpg"));
            image2 =ImageIO.read(new File("D:\\ndzy\\src\\3.jpg"));
        }catch (Exception e){
            e.printStackTrace();
        }

        //image1=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/3.jpg"));
        //image2=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/2.jpg"));
        //image3=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/1.jpg"));
    }
    public void tk_zd(Zdan z,Tank t){
        //判断子弹是否击中坦克
        //判断坦克方向
        switch (t.direction){
            case 0:
                if(z.x>=t.x&&z.x<=t.x+20&&z.y>=t.y&&z.y<=t.y+30){
                    //子弹死亡，敌方坦克死亡
                    z.isLive=false;
                    t.isLive=false;
                    //创建一个炸弹，放在bombs中
                    Bomb b = new Bomb(t.x,t.y);
                    bombs.add(b);
                }
                break;
            case 1:
                if(z.x>=t.x&&z.x<=t.x+30&&z.y>=t.y&&z.y<=t.y+20){
                    //子弹死亡，敌方坦克死亡
                    z.isLive=false;
                    t.isLive=false;
                    Bomb b = new Bomb(t.x,t.y);
                    bombs.add(b);
                }
                break;
            case 2:
                if(z.x>=t.x&&z.x<=t.x+20&&z.y>=t.y&&z.y<=t.y+30){
                    //子弹死亡，敌方坦克死亡
                    z.isLive=false;
                    t.isLive=false;
                    Bomb b = new Bomb(t.x,t.y);
                    bombs.add(b);
                }
                break;
            case 3:
                if(z.x>=t.x&&z.x<=t.x+30&&z.y>=t.y&&z.y<=t.y+20){
                    //子弹死亡，敌方坦克死亡
                    z.isLive=false;
                    t.isLive=false;
                    Bomb b = new Bomb(t.x,t.y);
                    bombs.add(b);
                }
                break;
        }

    }

    public void paint (Graphics g){
        super.paint(g);
        g.fillRect(0,0,800,600);

        //画我的坦克,和子弹
        for(int i=0;i<ets00.size();i++) {
            MyTank mt = ets00.get(i);
            if (mt.isLive) {
                this.drawTank(mt.getX(), mt.getY(), g, mt.getDirection(), mt.getColor(), mt.getType());
                //画子弹
                for(int j=0;j<mt.ss.size();j++){
                    //
                    Zdan zd=mt.ss.get(j);
                    if(zd.x<20||zd.y<20||zd.x>780||zd.y>580){
                        zd.isLive=false;
                    }


                    if(zd.isLive){
                        g.setColor(Color.green);
                        g.fill3DRect(zd.x, zd.y, 5, 5, false);

                    }else{
                        mt.ss.remove(zd);
                    }
                    Thread t = new Thread(zd);
                    t.start();
                }

            }else {
                ets00.remove(mt);/////
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
        //画敌方坦克和子弹
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

    public void pd_color(int color,Graphics g){
        //坦克颜色
        switch (color){
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.red);
                break;
        }
    }
    public  void m_Tank(int x,int y,int direct ,Graphics g){

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
    public  void q_Tank(int x,int y,int direct ,Graphics g){
        switch (direct){
            //向上
            case 0:
                    g.fill3DRect(x,y,5,30,false);
                    g.fill3DRect(x+15,y,5,30,false);
                    g.fill3DRect(x+5,y+5,10,20,false);
                    g.fillOval(x+5,y+10,10,10);
                    g.drawLine(x+10,y+15,x+10,y-5);

                break;
            //向右
            case 1:
                    g.fill3DRect(x,y,30,5,false);
                    g.fill3DRect(x,y+15,30,5,false);
                    g.fill3DRect(x+5,y+5,20,10,false);
                    g.fillOval(x+9,y+5,10,10);
                    g.drawLine(x+15,y+10,x+35,y+10);
                break;
            //向下
            case 2:
                    g.fill3DRect(x,y,5,30,false);
                    g.fill3DRect(x+15,y,5,30,false);
                    g.fill3DRect(x+5,y+5,10,20,false);
                    g.fillOval(x+5,y+10,10,10);
                    g.drawLine(x+10,y+15,x+10,y+35);
                break;
            //
            case 3:
                    g.fill3DRect(x,y,30,5,false);
                    g.fill3DRect(x,y+15,30,5,false);
                    g.fill3DRect(x+5,y+5,20,10,false);
                    g.fillOval(x+9,y+5,10,10);
                    g.drawLine(x+15,y+10,x-5,y+10);
                     break;
        }
    }
    //定义一个画坦克的函数drawTank
    public void drawTank(int x,int y,Graphics g,int direct,int color,int type ){
        this.pd_color(color,g);
        //判断类型
        switch (type){
            case 0:
                this.m_Tank(x,y,direct,g);
                break;
            case 1:
                this.q_Tank(x,y,direct,g);
                break;
        }
    }


    //实现接口
    public void keyPressed(KeyEvent e){
        for(int i=0;i<ets00.size();i++) {
            if (e.getKeyCode() == KeyEvent.VK_W) {
                ets00.get(i).direction = 0;
                ets00.get(i).moveUp();
            } else if (e.getKeyCode() == KeyEvent.VK_S) {
                ets00.get(i).direction = 2;
                ets00.get(i).moveDowm();
            } else if (e.getKeyCode() == KeyEvent.VK_A) {
                ets00.get(i).direction = 3;
                ets00.get(i).moveLeft();
            } else if (e.getKeyCode() == KeyEvent.VK_D) {
                ets00.get(i).direction = 1;
                ets00.get(i).moveRight();
            } else {
            }
            if (e.getKeyCode() == KeyEvent.VK_J) {

                //坦克只能发6发子弹
                if (this.ets00.get(i).ss.size() <= 100) {
                    ets00.get(i).shot();
                }
            }
        }
        this.repaint();
    }
    public void keyReleased(KeyEvent e){

    }
    public  void keyTyped(KeyEvent e){

    }



    //判断我方坦克是否击中敌方
    public void mk_shot(){
        for(int n=0;n<ets00.size();n++) {
            for (int i = 0; i <ets00.get(n).ss.size();i++) {
                Zdan zd = ets00.get(n).ss.get(i);
                //判断子弹是否有效
                if (zd.isLive) {
                    //取出每个坦克与之匹配
                    for (int j = 0; j < ets.size(); j++) {
                        //取出坦克
                        QTank01 qt = ets.get(j);
                        if (qt.isLive) {
                            this.tk_zd(zd, qt);
                        }
                    }
                }
            }
        }
    }
    //判断敌方坦克是否击中我方坦克
    public  void qk_shot(){
        for (int i=0;i<ets.size();i++){
            QTank01 qt = ets.get(i);
            for(int j=0;j<qt.ss01.size();j++){
                Zdan zd = qt.ss01.get(j);
                for(int n=0;n<ets00.size();n++) {
                    MyTank mt =ets00.get(n);
                    if (mt.isLive) {
                        this.tk_zd(zd, mt);
                    }
                }
            }
        }
    }
    //实现接口
    public  void pz_qt(){
        for(int i=0;i<ets.size();i++){
            int q=100;
            QTank01 qt =ets.get(i);
            for(int j=0;j<ets.size();j++){
                QTank01 qt01=ets.get(j);
                if(i!=j){
                    switch (qt.direction){
                        case 0:
                            if((qt01.y-qt.y)==q||(qt.x==qt01.x)){
                                qt.direction=2;
                            }
                            break;
                        case 1:
                            if((qt01.x-qt.x)==q||(qt.y==qt01.y)){
                                qt.direction=3;
                            }
                            break;
                        case 2:
                            if((qt.y-qt01.y)==q||(qt.x==qt01.x)){
                                qt.direction=2;
                            }
                            break;
                        case 3:
                            if((qt.x-qt01.x)==q||(qt.y==qt01.y)){
                                qt.direction=1;
                            }
                            break;
                    }
                }
            }
        }
    }
    public void run(){
       // QTank01 q =new QTank01(0,0);
       // q.ets01=ets;
        while (true){
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            //判断我方坦克是否击中敌方
            this.mk_shot();
            //判断敌方坦克是否击中我方坦克
            this.qk_shot();
            //*****************
            this.pz_qt();
            //重绘
            this.repaint();
        }

    }
}

