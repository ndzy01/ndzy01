/*
 * 作者：zhangyi
 * 时间：2018.11.18
 * 功能：类的学习
 */
package com.zhangyi01.java;

public class zy10 {
	public static void main(String[] args) {
		Person_zy10 zhangyi =new Person_zy10("张一");
		Cat_zy10 xiaobai=new Cat_zy10();
		zhangyi.speak();
		zhangyi.jisuan();
		xiaobai.speak();
		zhangyi.jisuan(1000);
		int result=zhangyi.add(12, 13);
		System.out.println("num1+num2="+result );
		System.out.println("年龄："+zhangyi.age+"名字："+zhangyi.name);

		
	
}
}
//创建一个人类
class Person_zy10{
	int age;//1
	String name;//2
	//构造方法1
	public  Person_zy10(int x,String y) {
		System.out.println("我是构造1");
		age=x;//前面的age是1定义的属性age，后面的是传进来的值age
		name=y;
	}
	//构造方法2
	public Person_zy10(String y){
		System.out.println("我是构造2");
		name=y;
	}
	//行为
	//可以输出我是好人
	//方法名的首字母小写
	
	public void speak() {
		System.out.println("我是一个好人！");			
	}
	public void jisuan() {
		int result =0;
		for (int i = 0; i < 1000; i++) {
			result=result+i;
		}
		System.out.println("结果是："+result);
	}
	public void jisuan(int n) {
		 int result=0;
		for (int i = 0; i < n; i++) {
			result+=i;
			
		}
		System.out.println("结果是："+result);
	}
	public int add(int num1,int num2) {
		return num1+num2;
	}
	
}
class Cat_zy10{
	int age;
	String name;
	public void speak() {
		System.out.println("我是一只好猫");
	}
}
