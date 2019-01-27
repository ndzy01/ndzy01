package com.zhangyi07.java;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author Zhang Yi
 * @create 2019- 01- 27- 10:15
 * @function //文件字符流
 */

public class Demo05 {
    public static void main(String[] args) {
        FileReader fr=null;
        //写入到文件
        FileWriter fw=null;
        try {
            fr =new FileReader("d:\\test.txt");
            fw =new FileWriter("d:\\zzz.txt" );
            char c[]=new char[1024];
            int n=0;
            while ((n=fr.read(c))!=-1){
                fw.write(c);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //必须
            try {
                fr.close();
                fw.close();
            }catch (Exception e){

            }
        }
    }
}
