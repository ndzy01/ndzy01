package com.test.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Zhang Yi
 * @create 2019- 01- 24- 15:40
 * @function
 */

public class text extends JFrame implements ActionListener {
    MyTankPanel mp = null;
    StartPanel startPanel=null;
    JMenuBar jmb=null;
    JMenu jm1=null;
    JMenuItem jmi1=null;



    public static void main(String[] args) {
        text t = new text();
    }
    public text(){


        //
        jmb =new JMenuBar();
        jm1=new JMenu("游戏(G)");
        jm1.setMnemonic('G');
        jmi1=new JMenuItem("开始游戏");
        //
        jmi1.addActionListener(this);


        jmi1.setActionCommand("NEW GAME");

        jm1.add(jmi1);
        jmb.add(jm1);

             startPanel=new StartPanel();
            Thread t = new Thread(startPanel);
            t.start();
            this.setJMenuBar(jmb);

            this.add(startPanel);

            this.setTitle("ndzy");//设置标题
            this.setSize(1000,700);//设置大小
            this.setLocation(100,200);//设置初始位置
            this.setResizable(true);//控制缩放功能
            this.setVisible(true);//显示
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭

        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("NEW GAME")){

            mp = new MyTankPanel();
            Thread t1 = new Thread(mp);
            t1.start();
            this.remove(startPanel);
            this.add(mp);
            this.addKeyListener(mp);
            //
            this.setVisible(true);
        }

    }
}
class StartPanel extends JPanel implements Runnable{
    int times=0;
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,800,600);
        this.draw(g);
    }
public void draw(Graphics g){
    if(times%2==0){
        g.setColor(Color.yellow);
        Font myFont =new Font("华文新魏",Font.BOLD,100);
        g.setFont(myFont);
        g.drawString("stage:1",200,300);
    }
}
    @Override
    public void run() {

        while (true){
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
            times++;
        }
    }
}