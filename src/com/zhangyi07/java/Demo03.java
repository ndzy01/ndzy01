package com.zhangyi07.java;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @author Zhang Yi
 * @create 2019- 01- 26- 18:54
 * @function
 */

public class Demo03 {
    public static void main(String[] args) {
        File f=new File("d:\\ss.txt");
        //
        FileOutputStream fos=null;
        try {

            fos=new FileOutputStream(f);
            String s="zhangyi123\r\n";
            String s1="456";
            //byte []bytes=new byte[1024];
            fos.write(s.getBytes());
            fos.write(s1.getBytes());

        }catch (Exception e){

        }finally {
            try {
                fos.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
