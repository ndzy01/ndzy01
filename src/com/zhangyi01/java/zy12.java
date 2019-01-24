/*
 * 作者：zhangyi
 * 时间：2018.11.20
 * 功能：了解this
 */

package com.zhangyi01.java;

public class zy12 {
	public static void main(String[] args) {
		Cat_zy12 cat1=new Cat_zy12(2,"小白");
		Person_zy12 zhangyi = new Person_zy12(cat1,20,"zhangyi");
		System.out.println(zhangyi.age+" "+zhangyi.name);
		zhangyi.showInFo();
		zhangyi.cat.speak();
	}
}
//定义一个人类
class Person_zy12{
	//成员变量
	int age;
	String name;
	Cat_zy12 cat;//引用类型
	//构造函数
	public Person_zy12(Cat_zy12 cat,int age,String name) {
		this.age=age;//this修饰对象的属性，this是属于一个具体的对象的，而不是属于类的
		this.name=name;
		this.cat=cat;
	}
	public void showInFo() {
		System.out.println("名字是："+this.name);
	}
}
class Cat_zy12{
	int age;
	String name;
	public Cat_zy12(int age,String name) {
		this.age=age;
		this.name=name;
	}
public void speak() {
	System.out.println("我是猫咪"+" "+"我的年龄："+this.age+" "+"我的名字:"+this.name);
	
}
}

