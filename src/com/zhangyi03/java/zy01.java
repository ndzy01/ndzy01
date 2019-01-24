/*
 * 作者：zhangyi
 * 时间：2018.11.25
 * 功能：数组的必要性
 */
package com.zhangyi03.java;

public class zy01 {
public static void main(String[] args) {
	float arr[]=new float[6];
	arr[0]=1f;
	arr[1]=2f;
	arr[2]=3f;
	arr[3]=4f;
	arr[4]=5f;
	arr[5]=6f;
	float all=0;
	for (int i = 0; i < 6; i++) {
		all+=arr[i];
	}
	System.out.println("总体重："+all);
	System.out.println(arr.length);
	
	int b[]= {1,2,3,4,5,6};
	System.out.println(b.length);
}
}
