/*
 * 作者：zhangyi
 * 时间：2018.11.23
 * 功能：多态学习
 */
package com.zhangyi01.java;

public class zy20 {
public static void main(String[] args) {
	//Cat_zy20 c1=new Cat_zy20();
	//c1.cry();
	//Dog_zy20 d1=new Dog_zy20();
	//d1.cry();
	Animal_zy20 an=new Cat_zy20();
	an.cry();
	an.eat();
	an=new Dog_zy20();
	an.cry();
	an.eat();
	Master_zy20 master=new Master_zy20();
	master.feed(new Dog_zy20(), new Bone_zy20());
}
}
class Master_zy20{
	public void feed(Animal_zy20 an,Food_zy20 bn) {
		an.eat();
		bn.showName();
	}
}
class Food_zy20{
	String name;

	public void showName() {
		System.out.println();
	}
}
class Fish_zy20 extends Food_zy20{
	public void showName() {
		System.out.println("鱼");
	}
}
class Bone_zy20 extends Food_zy20{
	public void showName() {
		System.out.println("骨头");
	}
}
//动物类
class Animal_zy20{
	 String name;
	 int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	//动物会叫
	public void cry() {
		System.out.println("不知道怎么叫！");
	}
	//动物喜欢吃东西
	public void eat() {
		System.out.println("不知道要吃啥");
	}
}
class Cat_zy20 extends Animal_zy20{
	public void cry() {
		System.out.println("我是猫咪：我会，喵喵叫！");
	}
	public void eat() {
		System.out.println("我是猫咪：我爱，吃鱼啦！");
	}
}

class Dog_zy20 extends Animal_zy20{
	public void cry() {
		System.out.println("我是狗狗：我会，汪汪叫！");
	}	
	public void eat() {
		System.out.println("我是狗狗：我爱，吃骨头啦！");
	}
}