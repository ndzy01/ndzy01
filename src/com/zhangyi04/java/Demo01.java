package com.zhangyi04.java;

import javax.swing.*;

/**
 * @author Zhang Yi
 * @data 2019/1/13 - 20:26
 * @funcation
 */

public class Demo01 extends JFrame {
    public static void main(String[] arg) {
        Demo01 demo01 = new Demo01();
    }
    public Demo01(){
        this.setTitle("ndzy01");//设置标题
        this.setSize(800,600);//设置大小
        this.setLocation(100,200);//设置初始位置
        this.setVisible(true);//显示
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭
    }


}
