package com.zhangyi04.java;





import javax.swing.*;
import java.awt.*;

/**
 * @author Zhang Yi
 * @data 2019/1/14 - 11:31
 * @funcation GridLayout
 */

public class Demo05 extends JFrame {
    int size = 9;
    JButton jbs[] = new JButton[size];
    public static void main (String[] args) {
    Demo05 demo05 = new Demo05();

    }

    public Demo05(){

        for (int i = 0; i <size; i++) {
            jbs[i] = new JButton(String.valueOf(i));
        }
        for (int i = 0; i <size; i++) {
            this.add(jbs[i]);
            
        }
        //设置布局管理
        this.setLayout(new GridLayout(3,3));
        this.setTitle("ndzy01");//设置标题
        this.setSize(800,600);//设置大小
        this.setLocation(100,200);//设置初始位置
        this.setResizable(false);//控制缩放功能
        this.setVisible(true);//显示
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭
    }
}
