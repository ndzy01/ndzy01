/*
 * 作者：zhangyi
 * 时间：2018.12.2
 * 功能：集合-LinkedList
 */
package com.zhangyi03.java;
import java.util.*;
public class zy08 {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();	
	Clerk_zy08 c1=new Clerk_zy08("zhangyi",20,1024.1f);
	l1.addFirst(c1);
}
}
//员工类
class Clerk_zy08{
	private  String name;
	private int age;
	private float sal;
	public Clerk_zy08(String name ,int age,float sal) {
		this.age=age;
		this.name=name;
		this.sal=sal;
	}
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
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	
}
