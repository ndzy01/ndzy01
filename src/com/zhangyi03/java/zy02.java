/*
 * 作者：zhangyi
 * 时间：2018.11.25
 * 功能：数组的必要性
 */
package com.zhangyi03.java;

import java.util.Scanner;

public class zy02 {
public static void main(String[] args) {
	Dog_zy02 dogs[]=new Dog_zy02[4];
	dogs[0]=new Dog_zy02();//给对象开辟空间
	dogs[0].setName("小白");
	dogs[0].setWeight(10);
	System.out.println(dogs[0].getName()+dogs[0].getWeight());
	Scanner scanner=new Scanner(System.in);

	for (int i = 0; i < 4; i++) {
		dogs[i]=new Dog_zy02();
		System.out.println("请输入"+(i+1)+"只狗名");
		String name = scanner.next();//
		dogs[i].setName(name);
		System.out.println("请输入"+(i+1)+"只狗的体重");
		int weight =scanner.nextInt();
		dogs[i].setWeight(weight);
		
	}
}
}
//
class Dog_zy02{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age;
	private int weight;
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}