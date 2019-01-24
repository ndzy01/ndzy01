/*
 * 作者：zhangyi
 * 时间：2018.11.16
 * 功能：循环控制
 */
package com.zhangyi01.java;

public class zy07 {
	public static void main(String[] args) {
		int b=0;
		for (int i = 0; i < 10; i++) {
			System.out.println("你好，我是刘德华！"+b);
			b++;
		}
		while(b<20) {
			System.out.println("Hello World!"+b);
			b++;
		}
	do {
		System.out.println("你好，世界！"+b);
		b++;
	} while (b<30);

	}

}
