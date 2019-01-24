/*
 * 作者：zhangyi
 * 时间：2018.11.16
 * 功能：控制台接受两个数，可以是整数也可以是小数，并判断他们是：大于、小于、还是等于关系
 */
package com.zhangyi01.java;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class zy06 {
	 public static void main(String[] args) {
	        try {
	            /*输入流，从键盘接收数
	            *InputStreamReader isr=new InputStreamReader(System.in);
	            *BufferedReader br=new BufferedReader(isr);
	            */
	            BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	            //给出提示
	            System.out.println("请输入第一个数");
	            String a1=in.readLine();
	            //从控制台读取一行数据
	            System.out.println("请输入第二个数");
	            String a2=in.readLine();
	            //String->float
	            float num1=Float.parseFloat(a1);
	            float num2=Float.parseFloat(a2);
	            if (num1>num2) {
	                System.out.println("第一个数大");
	            }
	            if (num1==num2) {
	                System.out.println("相等");
	            }
	            if (num1<num2) {
	                System.out.println("第二个数大");
	            }

	        } catch (Exception e) {
	            // TODO: handle exception
	            e.printStackTrace();
	        }

	 }
}
