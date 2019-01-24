/*
 * 作者：zhangyi
 * 时间：2018.11.25
 * 功能：排序_内部排序_插入式排序
 */
package com.zhangyi03.java;

public class zy04 {
public static void main(String[] args) {
	int len=15;
	int a[]= new int[len];
	for (int i = 0; i < len; i++) {
		//随机产生一个一到一万的数
		//Math.random()随机产生一个0-1的数
		int t=(int)(Math.random()*10000);
		a[i]=t;
	}	
	InsertSort_zy04 insert=new InsertSort_zy04();
	insert.sort(a);
	for (int i = 0; i < a.length; i++) {
	System.out.print(a[i]+" ");
}
}
}
class InsertSort_zy04{
	public void sort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			int insertVal=a[i];//insretVal准备和前一个数比较
			int index =i-1;
			while(index>=0&&insertVal<a[index]) {
				//将a[index]向后移
				a[index+1]=a[index];
				//让index向前移动
				index--;
			}
			//将inserVal插入到合适位置
			a[index+1]=insertVal;
		}

	}
}
