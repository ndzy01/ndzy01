/*
 * 作者：zhangyi
 * 时间：2018.11.25
 * 功能：排序_内部排序:交换式排序、选择式排序
 */
package com.zhangyi03.java;
import java.util.*;
import java.util.Calendar;
public class zy03 {
public static void main(String[] args) {
	int len=100000;
	int a[]= new int[len];
	for (int i = 0; i < len; i++) {
		//随机产生一个一到一万的数
		//Math.random()随机产生一个0-1的数
		int t=(int)(Math.random()*10000);
		a[i]=t;
	}

	//Bubble_zy03 bubble=new Bubble_zy03();
	//bubble.sort(a);
	Select_zy03 select=new Select_zy03();
	//在排序之前打印一个系统时间
	Calendar cal=Calendar.getInstance();
	System.out.println(cal.getTime());
	select.sort(a);
	//在排序之后打印一个系统时间
	cal=Calendar.getInstance();//重新得到实例
	System.out.println(cal.getTime());
	/*for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}*/
}
}
class Bubble_zy03{
	//冒泡法排序
int temp=0;

	public void sort(int b[]) {
		for (int i = 0; i < b.length-1; i++) {//外层循环
			for (int j = 0; j < b.length-1-i; j++) {
				if(b[j]>b[j+1]) {
					temp=b[j];
					b[j]=b[j+1];
					b[j+1]=temp;
				}
			}
			
		}
	}
}
class Select_zy03{
	public void sort(int a[]) {//选择排序

		int temp=0;
		for (int i = 0; i < a.length-1; i++) {
			//我认为第i个数是最小的
			int min=a[i];
			//记录最小数的下标
			int minIndex=i;
			for(int k=i+1;k<a.length;k++) {
				if(min>a[k]) {
					//修改最小
					min=a[k];
					minIndex=k;
				}
			
			}
			//当退出这个for循环时就找到了这次的最小值
			temp=a[i];
			a[i]=a[minIndex];
			a[minIndex]=temp;
		}
	}
}
	





