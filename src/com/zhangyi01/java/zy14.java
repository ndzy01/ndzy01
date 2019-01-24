/*
 * 作者：zhangyi
 * 时间：2018.11.20
 * 功能：学习类方法
 */
package com.zhangyi01.java;

public class zy14 {
	public static void main(String[] args) {
		Stu_zy14 s1=new Stu_zy14(1,"stu1",1000);
		Stu_zy14 s2=new Stu_zy14(2,"stu2",2000);
		Stu_zy14 s3=new Stu_zy14(3,"stu3",3000);
		Stu_zy14 s4=new Stu_zy14(4,"stu4",4000);
		Stu_zy14 s5=new Stu_zy14(5,"stu5",5000);
		Stu_zy14 s6=new Stu_zy14(6,"stu6",6000);
	System.out.println("学费总额："+Stu_zy14.TotalFree);
}
}
class Stu_zy14{
	int age;
	String name;
	int free;
	static int TotalFree;
	public  Stu_zy14(int age,String name,int free) {
		this.age=age;
		this.name=name;
		this.free=free;
		TotalFree+=free;
	}
	public static int total() {
		return TotalFree;
	}
	
}
