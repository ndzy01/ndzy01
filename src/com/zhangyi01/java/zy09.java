
/*
 * 作者：zhangyi
 * 时间：2018.11.16
 * 功能：打印金字塔
 */
package com.zhangyi01.java;

public class zy09 {
	public static void main(String[] args) {
		int lay=15;//表示有四层
		for (int i = 1; i <= lay; i++) {
			//找出空格规律
			//1->3,2->2,3->1,4->0
			for (int j = 1; j <= lay-i; j++) {
				System.out.print(" ");//打印空格
			}
			for (int k = 1; k <=i*2-1; k++) {
				//判断该层是否是顶层或者是底层
				if (i==1||i==lay) {
					System.out.print("*");
				}
				else {
					//如果是第一个*
					if (k==1||k==i*2-1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();//打印换行
		}
	}
}

