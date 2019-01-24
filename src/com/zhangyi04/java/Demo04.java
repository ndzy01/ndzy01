package com.zhangyi04.java;

import javax.swing.*;
import java.awt.*;

/**
 * @author Zhang Yi
 * @data 2019/1/13 - 23:03
 * @funcation
 */

public class Demo04 extends JFrame {
    JButton jb1,jb2,jb3,jb4,jb5,jb6;
    public static void main(String[] args) {
    Demo04 demo04 = new Demo04();
    }
    public Demo04(){


        //设置布局管理
        this.setLayout(new FlowLayout(FlowLayout.LEFT));//向左对齐
        this.setTitle("ndzy01");//设置标题
        this.setSize(800,600);//设置大小
        this.setLocation(100,200);//设置初始位置
        this.setResizable(false);//控制缩放功能
        this.setVisible(true);//显示
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭
    }
}



