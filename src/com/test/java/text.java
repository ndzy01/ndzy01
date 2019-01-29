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
    JMenuItem jmi2=null;
    JMenuItem jmi3=null;
    JMenuItem jmi4=null;
    public static void main(String[] args) {
        //创建一个实例
        text t = new text();
    }
    public text(){
        //创建一个新的菜单栏实例，JMenuBar创建一个新的菜单栏
        jmb =new JMenuBar();

        jm1=new JMenu("游戏(G)");
        jm1.setMnemonic('G');

        //创建一个带有指定文本的新菜单项
        jmi1=new JMenuItem("开始游戏(N)");
        jmi1.setMnemonic('N');

        jmi2=new JMenuItem("退出游戏（E)");
        jmi2.setMnemonic('E');

        jmi3=new JMenuItem("存盘退出（E)");
        jmi3.setMnemonic('K');

        jmi4=new JMenuItem("续上局（X）");
        jmi4.setMnemonic('X');

        //添加监听
        jmi1.addActionListener(this);
        jmi2.addActionListener(this);
        jmi3.addActionListener(this);
        jmi4.addActionListener(this);

        jmi1.setActionCommand("NEW GAME");
        jmi2.setActionCommand("exit");
        jmi3.setActionCommand("Keeping");
        jmi4.setActionCommand("xu");

        jm1.add(jmi1);
        jm1.add(jmi2);
        jm1.add(jmi3);
        jm1.add(jmi4);

        jmb.add(jm1);

        startPanel=new StartPanel();

        Thread t = new Thread(startPanel);
        t.start();

        this.add(startPanel);
        this.setJMenuBar(jmb);

        this.setTitle("ndzy");//设置标题
        this.setSize(950,700);//设置大小
        this.setLocation(100,200);//设置初始位置
        this.setResizable(true);//控制缩放功能
        this.setVisible(true);//显示
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("NEW GAME")){
            mp = new MyTankPanel("NEW GAME");
            Thread t1 = new Thread(mp);
            t1.start();
            this.remove(startPanel);
            this.add(mp);
            this.addKeyListener(mp);
            this.setVisible(true);
            //加入音频文件并播放
            AePlayWave apw=new AePlayWave("d:\\Tank\\1.wav");
            apw.start();
        }else if(e.getActionCommand().equals("exit")){
            Recorder.keepRecording();
            System.exit(0);
        }else if(e.getActionCommand().equals("Keeping")){
            Recorder r=new Recorder();
            r.setEts(mp.ets);
            r.keepRecordAndQt();
            System.exit(0);
        }else if(e.getActionCommand().equals("xu")){
            mp = new MyTankPanel("xu");
            Thread t1 = new Thread(mp);
            t1.start();
            this.remove(startPanel);
            this.add(mp);
            this.addKeyListener(mp);
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