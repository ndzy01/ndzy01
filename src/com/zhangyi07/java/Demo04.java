package com.zhangyi07.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author Zhang Yi
 * @create 2019- 01- 26- 19:28
 * @function
 */

public class Demo04 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            fis =new FileInputStream("D:\\ndzy\\src\\3.jpg");
            fos=new FileOutputStream("e:\\3.jpg");
            byte buf[]=new byte[512];
            int n=0;
            while ((n=fis.read(buf))!=-1){
                fos.write(buf);
                System.out.println("a");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                fis.close();
                fos.close();
            }catch (Exception e){
                e.printStackTrace();
            }

        }

    }
}
