package com.test.java;

import javax.swing.*;

/**
 * @author Zhang Yi
 * @create 2019- 01- 24- 15:40
 * @function
 */

public class text extends JFrame{
    MyTankPanel mp = null;

    public static void main(String[] args) {
        text t = new text();
    }
    public text(){
            mp = new MyTankPanel();
            this.add(mp);
            //
            Thread t = new Thread(mp);
            t.start();
            this.addKeyListener(mp);
            this.setTitle("ndzy");//设置标题
            this.setSize(800,600);//设置大小
            this.setLocation(100,200);//设置初始位置
            this.setResizable(true);//控制缩放功能
            this.setVisible(true);//显示
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭

        }
    }

