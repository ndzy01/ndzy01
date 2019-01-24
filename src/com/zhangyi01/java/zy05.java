/*
 * 作者:zhangyi
 * 时间：2018.11.16
 * 功能：分支控制练习
 */
package com.zhangyi01.java;

public class zy05 {
	public static void main(String[] args) {
		int a=100;
		int b=80;
		if (a>80) {
			System.out.println("a>80");
		}else if (a>50) {
			System.out.println("a>50");	
		}else {
			System.out.println("a<50");
		}
		switch (b) {
		case 80:
			System.out.println(80);
			break;
		case 100:
			System.out.println(100);
			break;
		default:
			break;
		}
	}
}
