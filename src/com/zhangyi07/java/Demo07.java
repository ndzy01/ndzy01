package com.zhangyi07.java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


/**
 * @author Zhang Yi
 * @create 2019- 01- 27- 17:40
 * @function
 */

public class Demo07 extends JFrame implements ActionListener {

  JTextArea jta = null;

  JMenuBar jmb=null;
  JMenu jm =null;
  JMenuItem jmi1 =null;
  JMenuItem jmi2=null;
    public static void main(String[] args) {
Demo07 demo07=new Demo07();
    }
    public Demo07 (){
        jta = new JTextArea();
        jm = new JMenu("文件");
        jmb=new JMenuBar();

        jm.setMnemonic('F');
        jmi1=new JMenuItem("打开");
        jmi2=new JMenuItem("保存");

        jmi1.addActionListener(this);
        jmi2.addActionListener(this);

        jmi1.setActionCommand("open");
        jmi2.setActionCommand("save");

        this.setJMenuBar(jmb);
        jmb.add(jm);
        jm.add(jmi1);
        jm.add(jmi2);

        this.add(jta);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)  {
        if(e.getActionCommand().equals("open")){
            System.out.println("open");
            JFileChooser jfc1=new JFileChooser();
            jfc1.setDialogTitle("请选择文件......");
            jfc1.showOpenDialog(null);
            jfc1.setVisible(true);
            //得到用户选择的文件全路径
            String filename=jfc1.getSelectedFile().getAbsolutePath();
            BufferedReader br =null;
            FileReader fr =null;
            try {
                //先创建一个FileReader对象
                fr =new FileReader(filename);
                br=new BufferedReader(fr);
                //
                String s="";
                String allCon="";
                while ((s=br.readLine())!=null){
                    //
                    allCon+=s+"\r\n";
                    //
                    jta.setText(allCon);

                }

            }catch (Exception e1){
                e1.printStackTrace();
            }finally {
                try {
                    fr.close();
                    br.close();
                }catch (Exception e2){
                    e2.printStackTrace();
                }
            }
        }
        else if(e.getActionCommand().equals("save")){
            JFileChooser jfc = new JFileChooser();
            jfc.setDialogTitle("另存为......");
            jfc.showSaveDialog(null);
            jfc.setVisible(true);
            //得到用户，想保存的路径
            //得到用户选择的文件全路径
            String filename1=jfc.getSelectedFile().getAbsolutePath();
            //准备写入到指定目录
            BufferedWriter bw =null;
            FileWriter fw =null;
            try {
                //先创建一个FileReader对象
                fw =new FileWriter(filename1);
                bw=new BufferedWriter(fw);
                bw.write(this.jta.getText());
                //


            }catch (Exception e1){
                e1.printStackTrace();
            }finally {
               try {
                   bw.close();//必须先关闭
                   fw.close();

               }catch (Exception e2){
                e2.printStackTrace();
               }


            }
        }
    }
}
