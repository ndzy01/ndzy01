package com.test.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Vector;

/**
 * @author Zhang Yi
 * @create 2019- 01- 28- 16:34
 * @function
 *  String xyz[]=n.split(" ");//""里面是一个空格
 */

public class Recorder {
    private static int enNumber=7;
    private static int mylife=1;

    private  static int allNumber=0;
    private static FileWriter fw=null;
    private static BufferedWriter bw=null;
    private  static FileReader fr=null;
    private  static BufferedReader br=null;
    private  Vector<QTank01> ets = new Vector<QTank01>();
   static Vector<Node> nodes = new Vector<Node>();

    public static int getEnNumber() {
        return enNumber;
    }

    public static void setEnNumber(int enNumber) {
        Recorder.enNumber = enNumber;
    }

    public static int getMylife() {
        return mylife;
    }

    public static void setMylife(int mylife) {
        Recorder.mylife = mylife;
    }


    public static void reduceNum(){
        enNumber--;
    }

    public static void addNum(){
        allNumber++;

    }
    public static void reduce_mylife_Num(){
        mylife--;

    }

    public static void getNodesAndqt(){
        try {
            fr=new FileReader("d:\\Tank\\myRecord.txt");
            br=new  BufferedReader(fr);
            String n="";
            n=br.readLine();
            //string转int
            allNumber =Integer.parseInt(n);
            while ((n=br.readLine())!=null){
                //
                String xyz[]=n.split(" ");//""里面是一个空格

                    Node node=new Node(Integer.parseInt(xyz[0]),Integer.parseInt(xyz[1]),Integer.parseInt(xyz[2]));
                    nodes.add(node);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                br.close();
                fr.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }


    public static void getRecording(){
        try {
            fr=new FileReader("d:\\Tank\\myRecording.txt");
           br=new  BufferedReader(fr);
           String n=br.readLine();
           //string转int
           allNumber =Integer.parseInt(n);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                br.close();
                fr.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
    public  void keepRecordAndQt(){
        try {
            fw=new FileWriter("d:\\Tank\\myRecord.txt");
            bw=new BufferedWriter(fw);
            bw.write(allNumber+"\r\n");

            for (int i = 0; i <ets.size() ; i++) {
                //
                QTank01 qt=ets.get(i);
                if(qt.isLive){
                    String recode=qt.x+" "+qt.y+" "+qt.direction+" ";
                    bw.write(recode+"\r\n");
                }

            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                bw.close();
                fw.close();


            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
    public  static void keepRecording(){
        try {
            fw=new FileWriter("d:\\Tank\\myRecording.txt");
            bw=new BufferedWriter(fw);
            bw.write(allNumber+"\r\n");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                bw.close();
                fw.close();


            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }


    public static int getAllNumber() {
        return allNumber;
    }

    public static void setAllNumber(int allNumber) {
        Recorder.allNumber = allNumber;
    }

    public  Vector<QTank01> getEts() {
        return ets;
    }

    public  void setEts(Vector<QTank01> ets) {
       this.ets = ets;
    }
}
