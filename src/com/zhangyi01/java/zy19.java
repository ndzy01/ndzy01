/*
 * 作者：zhangyi
 * 时间：2018.11.22
 * 功能：丢手帕问题
 */
package com.zhangyi01.java;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class zy19 {
public static void main(String[] args) {
	Cyclink_zy19 cyclink =new Cyclink_zy19();
	cyclink.setLen(5);
	cyclink.createLink();
	//cyclink.show();
	cyclink.setk(2);
	cyclink.setm(2);
	cyclink.play();
}
}
class Child_zy19{
	int no;
	Child_zy19 nextChild_zy19=null;
	public Child_zy19(int no) {
		//初始化小孩的编号
		this.no=no;
	}
}

//环形链表
class Cyclink_zy19{
	//先定义一个指向链表第一个小孩的引用
	//指向第一个小孩的引用
	Child_zy19 firstChild_zy19=null;
	Child_zy19 temp=null;
	int len=0;//表示共有几个小孩
	int k=0;
	int m=0;
	
	//设置链表大小
	public void setLen(int len) {
		this.len=len;
	}
	//初始化环形链表
	public void createLink() {
		for (int i = 1; i <= len; i++) {
			if(i==1) {
			Child_zy19 c1=new Child_zy19(i);//创建第一个小孩
			this.firstChild_zy19=c1;
			this.temp=c1;
			}else {
				//创建最后一个小孩
				if(i==len) {
				//继续创建小孩
				Child_zy19 c1=new Child_zy19(i);
				temp.nextChild_zy19=c1;
				temp=c1;
				temp.nextChild_zy19=this.firstChild_zy19;
				}else {
					//继续创建小孩
					Child_zy19 c1=new Child_zy19(i);
					temp.nextChild_zy19=c1;
					temp=c1;
				}
			}
			
		}
		//最后一个小孩
		//System.out.println(temp.no);
	}
	//设置k,从第几个开始数数
	public void setk(int k) {
		this.k=k;
	}
	//设置m
	public void setm(int m) {
		this.m=m;
	}
//开始play
	
	public void play() {
		Child_zy19 temp= this.firstChild_zy19;
		//1.先找到第一个数数的人
		for (int i = 1; i <k; i++) {
			temp=temp.nextChild_zy19;
		}
		while(this.len!=1) {
		//2.数m下
		for (int j = 0; j < m; j++) {
			temp=temp.nextChild_zy19;
		}
		//找到要出圈的前一个小孩
		Child_zy19 temp2=temp;
		while(temp2.nextChild_zy19!=temp) {
		temp2=temp2.nextChild_zy19;
		}
		//3.将数到m的小孩，退出圈
		temp2.nextChild_zy19=temp.nextChild_zy19;
		temp=temp.nextChild_zy19;//让temp指向下一个数数的小孩
	//this.show();
		this.len--;
		}
		System.out.println("最后出圈："+temp.no);
	}
	
	
	public void show() {//打印环形链表
		//定义一个跑龙套
		Child_zy19 temp= this.firstChild_zy19;
		do {
			System.out.print(temp.no+" ");
			temp=temp.nextChild_zy19;
		}while(temp!=this.firstChild_zy19);
	}

}
