package com.zhangyi04.java;

import javax.swing.*;
import java.awt.*;

/**
 * @author Zhang Yi
 * @data 2019/1/14 - 17:00
 * @funcation
 */

public class Demo06 extends JFrame {
    JPanel jp1,jp2;
    JButton jb1,jb2,jb3,jb4,jb5,jb6;



    public static void main(String[] args) {
    Demo06 demo06 = new Demo06();
    }
        public Demo06(){

            jp1 = new JPanel();
            jp2 = new JPanel();

            jb1 = new JButton("jb1");
            jb2 = new JButton("jb2");
            jb3 = new JButton("jb3");
            jb4 = new JButton("jb4");
            jb5 = new JButton("jb5");
            jb6 = new JButton("jb6");
            //添加组件
            jp1.add(jb1);
            jp1.add(jb2);
            jp2.add(jb3);
            jp2.add(jb4);
            jp2.add(jb5);

            this.add(jp1,BorderLayout.NORTH);
            this.add(jb6,BorderLayout.CENTER);
            this.add(jp2,BorderLayout.SOUTH);
            //设置布局管理
            this.setTitle("ndzy01");//设置标题
            this.setSize(300,150);//设置大小
            this.setLocation(100,200);//设置初始位置
            this.setResizable(false);//控制缩放功能
            this.setVisible(true);//显示
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭
        }


}
