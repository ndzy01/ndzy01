/*
 * 作者：zhangyi
 * 时间：2018.11.16
 * 功能：打印金字塔
 */
package com.zhangyi01.java;

public class zy08 {
	public static void main(String[] args) {
		int lay=10;//表示有四层
		for (int i = 1; i <= lay; i++) {
			//找出空格规律
			//1->3,2->2,3->1,4->0
			for (int j = 1; j <= lay-i; j++) {
				System.out.print(" ");//打印空格
			}
			for (int k = 1; k <=i*2-1; k++) {
				System.out.print("*");
			}
			System.out.println();//打印换行
		}
	}
}
