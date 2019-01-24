package com.zhangyi04.java;

import javax.swing.*;
import java.awt.*;

/**
 * @author Zhang Yi
 * @data 2019/1/14 - 17:21
 * @funcation
 */

public class Demo07 extends JFrame {
    JPanel jp1,jp2,jp3;
    JLabel jl1,jl2;
    JButton jb1,jb2;
    JTextField jtf1,jtf2;
    public static void main(String[] args) {
       Demo07 demo07 = new Demo07();
    }
    public Demo07(){
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();

        jl1 = new JLabel("用户名");
        jl2 = new JLabel("密 码");

        jb1 = new JButton("登录");
        jb2 = new JButton("取消");

        jtf1 = new JTextField(10);
        jtf2 = new JTextField(10);

        this.setLayout(new GridLayout(3,1));

        jp1.add(jl1);
        jp1.add(jtf1);

        jp2.add(jl2);
        jp2.add(jtf2);

        jp3.add(jb1);
        jp3.add(jb2);

        this.add(jp1);
        this.add(jp2);
        this.add(jp3);

        this.setTitle("会员登录界面");//设置标题
        this.setSize(300,150);//设置大小
        this.setLocation(100,200);//设置初始位置
        this.setResizable(false);//控制缩放功能
        this.setVisible(true);//显示
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭
    }

}
