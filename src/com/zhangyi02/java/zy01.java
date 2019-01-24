/*
 * 作者：zhangyi
 * 时间：2018.11.24
 * 功能：抽象类学习
 */
package com.zhangyi02.java;


public class zy01 {
public static void main(String[] args) {
	Master_zy01 mastr=new Master_zy01();
	mastr.feed(new Cat_zy01(), new Fish_zy01());
}
}
class Master_zy01{
	public void feed(Animal_zy01 an,Food_zy01 bn) {
		an.eat();
		bn.showName();
	}
}
abstract class Food_zy01{
	String name;
abstract public void showName();
}
class Fish_zy01 extends Food_zy01{
	public void showName() {
		System.out.println("鱼");
	}
}
class Bone_zyo1 extends Food_zy01{
	public void showName() {
		System.out.println("骨头");
	}
}
//抽象类
abstract class Animal_zy01{
	 String name;
	 int age;
	 abstract public void cry() ;
	 abstract public void eat() ;
}
class Cat_zy01 extends Animal_zy01{
	public void cry() {
		System.out.println("我是猫咪：我会，喵喵叫！");
	}
	public void eat() {
		System.out.println("我是猫咪：我爱，吃鱼啦！");
	}
}

class Dog_zy01 extends Animal_zy01{
	public void cry() {
		System.out.println("我是狗狗：我会，汪汪叫！");
	}	
	public void eat() {
		System.out.println("我是狗狗：我爱，吃骨头啦！");
	}
}