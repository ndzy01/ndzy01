/*
 * 作者：zhangyi
 * 时间：2018.11.22
 * 功能：学习方法的重载
 */
package com.zhangyi01.java;

public class zy17 {

	public static void main(String[] args) {
		A_zy17 a1=new A_zy17();
		a1.getnumber(12, 13);
		a1.getnumber(12.6f, 13.4f);
	}

}
//如果只是控制访问修饰符和返回类型不一样不是重载
class A_zy17{
	//定义一个方法
	public int getnumber(int a,int b) {
		return a+b;
	}
	//方法重载
	public float getnumber(float a,float b) {
		return a+b;
	}
	
}