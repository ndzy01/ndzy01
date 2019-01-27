package com.zhangyi05.java;

import javax.swing.*;
import  java.awt.*;

/**
 * @author Zhang Yi
 * @create 2019- 01- 23- 9:45
 * @function
 */

public class Demo01 extends JFrame {
    Mypanel01 mp = null;
    public static void main(String[] args) {
    Demo01 demo01 = new Demo01();
    }
    public Demo01(){
        mp = new Mypanel01();
        this.add(mp);

        this.setTitle("ndzy");//设置标题
        this.setSize(800,600);//设置大小
        this.setLocation(100,200);//设置初始位置
        this.setResizable(true);//控制缩放功能
        this.setVisible(true);//显示
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭

    }
}
//定义一个Mypanel(我自己的面板)
class Mypanel01 extends JPanel{
    //重写JPanel 的paint方法
    //Graphics 画笔
    public void paint(Graphics g){
        //1.调用父类初始化
        //不可少
        super.paint(g);
        System.out.println("paint调用");
        //画圆
        //g.drawOval(10,10,30,30);
        //画图片
        Image im = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/虞姬.png"));
        //实现
        g.drawImage(im,90,90,200,140,this);


    }
}
