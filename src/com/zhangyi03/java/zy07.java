/*
 * 作者：zhangyi
 * 时间：2018.12.2
 * 功能：集合-ArrayList
 */
package com.zhangyi03.java;
//引入包
import java.util.*;
public class zy07 {
public static void main(String[] args) {
	//定义Arraylist对象
	ArrayList a1=new ArrayList();
	System.out.println(a1.size());
	Clerk_zy07 c1=new Clerk_zy07("zhangyi",20,1024.1f);
	Clerk_zy07 c2=new Clerk_zy07("xiaobai",20,1024.2f);
	a1.add(c1);
	a1.add(c2);
	a1.remove(1);
	System.out.println(a1.size());
	Clerk_zy07 temp=(Clerk_zy07)a1.get(0);
	System.out.println(temp.getAge()+temp.getName());
}
}
//员工类
class Clerk_zy07{
	private  String name;
	private int age;
	private float sal;
	public Clerk_zy07(String name ,int age,float sal) {
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