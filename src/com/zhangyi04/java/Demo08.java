package com.zhangyi04.java;

import javax.swing.*;

/**
 * @author Zhang Yi
 * @data 2019/1/14 - 18:04
 * @funcation
 */

public class Demo08 extends JFrame{
    JPanel jp1,jp2,jp3;
    JLabel jl1,jl2;
    JTextField jtf1;
    JButton jb1,jb2;
    public static void main(String[] args) {
    Demo08 demo08 = new Demo08();
    }
    public Demo08(){
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();

        jl1 = new JLabel("你最喜欢的运动");
        jl1 = new JLabel("你的性别");

        jb1 = new JButton("注册用户");
        jb2 = new JButton("取消注册");



        this.setTitle("用户注册界面");//设置标题
        this.setSize(300,150);//设置大小
        this.setLocation(100,200);//设置初始位置
        this.setResizable(false);//控制缩放功能
        this.setVisible(true);//显示
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭
    }
}
