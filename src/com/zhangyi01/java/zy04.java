	/*
	 * 作者：zhangyi
	 * 时间：2018.11.16
	 * 功能：&&，||，！练习
	 */
package com.zhangyi01.java;

public class zy04 {
		public static void main(String[] args) {
			int a=90;
			int b=90;
			if (a==b||a>80) {
				System.out.println("ok1");
			}
			b--;
			if (a>b&&a>45) {
				System.out.println("ok2");
			}
			if (!(a<=b)) {
				System.out.println("ok3");
				
			}
		}

}
