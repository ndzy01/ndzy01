package com.zhangyi07.java;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Zhang Yi
 * @create 2019- 01- 26- 17:34
 * @function
 */

public class Demo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis =null;
        try {
            fis = new FileInputStream("d:\\test.txt");
            //定义一个字节数组
            byte []bytes=new byte[1024];
            int n=0;//得到实际读取到的字节数
            while((n=fis.read(bytes))!=-1){
                String s=new String(bytes,0,n);
                System.out.println(s);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            }catch (IOException e){
                e.printStackTrace();
            }

        }
    }
}
