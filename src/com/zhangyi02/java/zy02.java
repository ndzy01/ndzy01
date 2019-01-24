/*
 * 作者：zhangyi
 * 时间：2018.11.24
 * 功能：接口学习
 */
package com.zhangyi02.java;

public class zy02 {
public static void main(String[] args) {
	Computer_zy02 c=new Computer_zy02();
	c.useUsb(new Camear_zy02());
	c.useUsb(new Phone_zy02());
}
}
//接口
interface Usb{
	int a=1;
	//声明两个方法
	//开始工作
	public void start();
	//停止工作
	public void stop();
}


//相机类，并实现usb接口
class Camear_zy02 implements Usb{
	public void start() {
		System.out.println("我是相机：我开始工作了");
	}
	public void stop() {
		System.out.println("我是相机：我停止工作了");
	}
}
class Phone_zy02 implements Usb{
	public void start() {
		System.out.println("我是手机：我开始工作了");
	}
	public void stop() {
		System.out.println("我是手机：我停止工作了");
	}
}
class Computer_zy02{
	public void useUsb(Usb usb) {
		usb.start();
		usb.stop();	
	}
}