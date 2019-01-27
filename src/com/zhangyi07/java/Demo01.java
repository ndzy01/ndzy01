package com.zhangyi07.java;

import java.io.File;
import java.io.IOException;

/**
 * @author Zhang Yi
 * @create 2019- 01- 26- 16:42
 * @function
 */

public class Demo01 {
    public static void main(String[] args) throws IOException {
        //创建一个文件对象
        File f =new File("d:\\test.txt");
        //得到文件的路径
        System.out.println("文件路径："+f.getAbsolutePath());
        //文件大小
        System.out.println("文件大小:"+f.length());
        //文件可读
        System.out.println("可读："+f.canRead());
        //创建文件
        File f1=new File("d:\\hsp.txt" );

        if(!f1.exists()) {
            try{
            f1.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        else{
            System.out.println("已经有该文件了，不能创建");
        }
        File f2=new File("d:\\ff" );

        if(f2.isDirectory()) {
            System.out.println("已经有该文件了，不能创建");
        }
        else{
           f2.mkdir();
        }
        File f3=new File("d:\\");
        if(f3.isDirectory()){
            File lists[]=f3.listFiles();
            for(int i=0;i<lists.length;i++){
                System.out.println("文件名："+lists[i].getName());
            }
        }



    }
}
