package com.zhangyi06.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Zhang Yi
 * @create 2019- 01- 24- 9:28
 * @function
 */

public class Demo01 extends  JFrame implements ActionListener {
    JPanel mp = null;
    JButton jb1 = null ,jb2 = null;
        public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        }
    public Demo01(){
        mp = new JPanel();
        jb1 = new JButton("黑色");
        jb2 = new JButton("红色");

        this.add(jb1,BorderLayout.NORTH);
        mp.setBackground(Color.black);
        this.add(mp);
        this.add(jb2,BorderLayout.SOUTH);
        Cat cat = new Cat();
        //注册监听
        jb1.addActionListener(this);
        jb1.addActionListener(cat);
        jb1.setActionCommand("黑色");
        jb2.addActionListener(this);
        jb2.addActionListener(cat);
        jb2.setActionCommand("红色");
        this.setTitle("ndzy");//设置标题
        this.setSize(800,600);//设置大小
        this.setLocation(100,200);//设置初始位置
        this.setResizable(true);//控制缩放功能
        this.setVisible(true);//显示
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭



    }
    public void actionPerformed(ActionEvent e){
        //判断那个菜单被点击
        if(e.getActionCommand().equals("黑色")){
            System.out.println("点击黑色按钮");
            mp.setBackground(Color.blue);
        }else if(e.getActionCommand().equals("红色")){
            System.out.println("点击红色按钮");
            mp.setBackground(Color.red);
        }else{
            System.out.println("你点的哪里");
        }
    }
}
/*class Mypanel extends JPanel{
    public void paint (Graphics g){
        super.paint(g);
        g.fillRect();

    }
}
*/
class Cat implements  ActionListener{
    public void actionPerformed(ActionEvent e){
        //判断那个菜单被点击
        if(e.getActionCommand().equals("黑色")){
            System.out.println("猫猫知道你点击黑色按钮");
        }else if(e.getActionCommand().equals("红色")){
            System.out.println("猫猫知道你点击红色按钮");
        }else{
            System.out.println("你点的哪里");
        }
    }
}