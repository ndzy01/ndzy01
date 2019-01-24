/*
 * 作者：zhangyi
 * 时间：2018.11.22
 * 功能：类封装
 */
package com.zhangyi01.java;

public class zy15 {
 public static void main(String[] args) {
	 Clerk_zy15 clerk1 =new Clerk_zy15("xiaohua",22,4567.6f);
	 System.out.println(clerk1.name);
	 System.out.println("薪水："+clerk1.getsalary());
}
}
class Clerk_zy15{
	public String name;
	//private私有的
	private int age;
	private float salary;
	public Clerk_zy15(String name,int age,float salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	//通过一个成员方法去控制和访问私有属性
	public float getsalary() {
		return this.salary;
	}
}

