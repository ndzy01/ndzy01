/*
 * 作者：zhangyi
 * 时间：2018.11.22
 * 功能：说明继承的重要性
 */
package com.zhangyi01.java;

public class zy16 {
	public static void main(String[] args) {
		Stu_zy16_x x1=new Stu_zy16_x();
		System.out.println("我是一名小学生，我的名字："+x1.printname());

	}
}
//创建学生类
class Stu_zy16{
	//定义成员属性
	public int age;
	public String name;
	public float fee;
	public String printname() {
		return this.name;
	}
	
}
//用关键字extends继承
class Stu_zy16_x extends Stu_zy16{
	//交费
	public void pay(float fee) {
		this.fee=fee;
	}
}
class Stu_zy16_z extends Stu_zy16{
	//交费
	public void pay(float fee) {
		this.fee=fee*0.8f;
	}
}
class Stu_zy16_d extends Stu_zy16{
	//交费
	public void pay(float fee) {
		this.fee=fee*0.1f;
	}
}


