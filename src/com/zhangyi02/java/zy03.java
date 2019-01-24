/*
 * 作者：zhangyi
 * 时间：2018.11.24
 * 功能：接口学习
 */
package com.zhangyi02.java;

public class zy03 {
public static void main(String[] args) {
	LittleMonkey_zy03	l=new LittleMonkey_zy03();
	l.fly();
	l.jump();
	l.swimming();
}
}
interface Fish_zy03{
	public void swimming();
	
}
interface Bird_zy03{
	public void fly();
	
}
class Monkey_zy03{
	String name;
	public void jump() {
		System.out.println("猴子会跳！");
	}
}

class LittleMonkey_zy03 extends Monkey_zy03 implements Fish_zy03,Bird_zy03{

	@Override
	public void swimming() {
		// TODO Auto-generated method stub
		System.out.println("猴子会游泳");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("猴子会飞!");
	}
	
}