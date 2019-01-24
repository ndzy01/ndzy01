/*
 * 作者：zhangyi
 * 时间：2018.11.24
 * 功能：final学习
 */
package com.zhangyi02.java;

public class zy04 {
public static void main(String[] args) {
	
}
}
class A_zy04{
	final int a=1;
	int b=0;
	//给成员方法用final修饰，表明不可以被修改，和覆盖
	final public void sendMes() {
		System.out.println();
	}
}
class B_zy04 extends A_zy04{

}