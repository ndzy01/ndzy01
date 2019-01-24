/*
 * 作者：zhamgyi
 * 时间：2018.11.18
 * 功能：类练习
 */
package com.zhangyi01.java;
import java.util.Scanner;
public class zy11 {
	public static void main(String[] args) {
		//提示输入一个整数
		System.out.println("请输入一个整数");
		int in=new Scanner(System.in).nextInt();//从键盘接收一个数		
		Suanshu zhangyi=new Suanshu();
		zhangyi.jiujiuchengfabiao(in);
}
}
 class Suanshu {
	public void jiujiuchengfabiao(int n) {
		//打印九九乘法表
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+"*"+i+"="+j*i+" ");
			}
			System.out.println();
		}
	}
}
