/*
 * 作者：zhangyi
 * 时间：2018.11.22
 * 功能：学习方法的覆盖
 */
package com.zhangyi01.java;

public class zy18 {
	public static void main(String[] args) {
		Cat_zy18 cat1=new Cat_zy18();
		cat1.cry();
		Dog_zy18 dog1=new Dog_zy18();
		dog1.cry();
}
}
class Animal_zy18{
	int age;
	String name;
	//都会叫
	public void cry() {
		System.out.println("我是动物，我不会叫！");
	}
	
}
//猫类
class Cat_zy18 extends Animal_zy18{
	//覆盖父类
	public void cry() {
		System.out.println("猫咪：喵喵叫！");
	}
}
//狗类
class Dog_zy18 extends Animal_zy18{
	//覆盖父类
	public void cry() {
		System.out.println("狗狗：汪汪叫！");
	}
}