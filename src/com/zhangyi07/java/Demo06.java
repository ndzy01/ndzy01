package com.zhangyi07.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author Zhang Yi
 * @create 2019- 01- 27- 17:21
 * @function String 流
 */

public class Demo06 {
    public static void main(String[] args) {
        BufferedReader br =null;
        BufferedWriter bw = null;
      try {
          //先创建一个FileReader对象
          FileReader fr =new FileReader("d:\\test.txt");
          br=new BufferedReader(fr);
          //
          FileWriter fw=new FileWriter("d:\\zzz.txt");
          bw =new BufferedWriter(fw);
          String s="";
          while ((s=br.readLine())!=null){
            //
                    bw.write(s+"\r\n");
          }

      }catch (Exception e){
          e.printStackTrace();
      }finally {
          try {
              br.close();
              bw.close();
          }catch (Exception e){
              e.printStackTrace();
          }
      }
    }
}
