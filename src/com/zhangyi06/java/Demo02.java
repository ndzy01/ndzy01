package com.zhangyi06.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author Zhang Yi
 * @create 2019- 01- 24- 10:42
 * @function
 */

public class Demo02 extends JFrame {
    Mypanel mp = null;
    public static void main(String[] args) {
        Demo02 demo02 = new Demo02();
    }
    public  Demo02(){

        mp = new Mypanel();
        this.add(mp);
        this.addKeyListener(mp);
        this.setTitle("ndzy01");//设置标题
        this.setSize(800,600);//设置大小
        this.setLocation(100,200);//设置初始位置
        this.setResizable(false);//控制缩放功能
        this.setVisible(true);//显示
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭
    }
}
class Mypanel extends  JPanel implements KeyListener {
    int x = 100;
    int y = 100;
    public  void paint (Graphics g){
        super.paint(g);
        g.fillOval(x,y,20,20);
    }
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode()==KeyEvent.VK_W){
            y=y-2;
        }else if(e.getKeyCode()==KeyEvent.VK_S){
            y=y+2;
        }else if(e.getKeyCode()==KeyEvent.VK_A){
            x=x-2;
        }else if(e.getKeyCode()==KeyEvent.VK_D){
            x=x+2;
        }else{
            System.out.println(x);
            System.out.println(y);
        }
                this.repaint();
    }
    public void keyReleased(KeyEvent e){

    }
    public  void keyTyped(KeyEvent e){

    }
}