/*
 * 作者：zhangyi
 * 时间：2018.11.20
 * 功能：理解类变量
 */
package com.zhangyi01.java;

public class zy13 {
	public static void main(String[] args) {
		Child_zy13 c1=new Child_zy13(1,"xiaoyi");
		c1.jiariGame();
		
		Child_zy13 c2=new Child_zy13(2,"xiaoer");
		c2.jiariGame();
		
		Child_zy13 c3=new Child_zy13(3,"xiaosan");
		c3.jiariGame();
		
		Child_zy13 c4=new Child_zy13(4,"xiaosi");
		c4.jiariGame();
		
		Child_zy13 c5=new Child_zy13(5,"xiaowu");
		c5.jiariGame();
		
		Child_zy13 c6=new Child_zy13(6,"xiaoliu");
		c6.jiariGame();
		
		Child_zy13 c7=new Child_zy13(7,"xiaoqi");
		c7.jiariGame();
		
		Child_zy13 c8=new Child_zy13(8,"xiaoba");
		c8.jiariGame();
		
		System.out.println("一共有"+c1.total+"个小孩加入游戏!");
		System.out.println(c2.age+" "+c2.name+" "+c2.total+" "+"任何一个对象都可以访问类变量total");
		System.out.println("也可以用类名访问类变量total："+"total="+Child_zy13.total);
		
		A_zy13 d1=new A_zy13();
		System.out.println(d1.i);
		
		A_zy13 d2=new A_zy13();
		System.out.println(d2.i);
		System.out.println(A_zy13.i);
		
		}
}

class Child_zy13{
	int age;
	String name;
	static int total=0;//类变量
	public Child_zy13(int age,String name) {
		this.age=age;
		this.name=name;
	}
	public void jiariGame() {
		System.out.println("我是:"+this.name+" "+"我加入游戏了!");
		total++;
	}
}
class A_zy13{
	static int i=1;
	static {
		i++;
		System.out.println("a");
	}
	public  A_zy13() {
		i++;
		System.out.println("b");
	}
	
}