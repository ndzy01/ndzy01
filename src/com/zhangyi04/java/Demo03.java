package com.zhangyi04.java;

import javax.swing.*;
import java.awt.*;

/**
 * @author Zhang Yi
 * @data 2019/1/13 - 22:44
 * @funcation BorderLayout
 */

public class Demo03 extends JFrame {
    JButton jb1,jb2,jb3,jb4,jb5;

    public static void main(String[] args) {
        Demo03 demo03 = new Demo03();
    }
    public Demo03(){
        //创建组件
        jb1 = new JButton("中部");
        //jb2 = new JButton("北部");
        jb3 = new JButton("东部");
        jb4 = new JButton("南部");
        jb5 = new JButton("西部");
        //添加组件
        this.add(jb1,BorderLayout.CENTER);
        //this.add(jb2,BorderLayout.NORTH);
        this.add(jb3,BorderLayout.EAST);
        this.add(jb4,BorderLayout.SOUTH);
        this.add(jb5,BorderLayout.WEST);

        //初始设置
        this.setTitle("ndzy01");//设置标题
        this.setSize(800,600);//设置大小
        this.setLocation(100,200);//设置初始位置
        this.setVisible(true);//显示
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭

    }
}
