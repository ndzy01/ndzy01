/*
 * 作者：zhangyi
 * 时间：2018.11.25
 * 功能：二分查找
 */
package com.zhangyi03.java;

public class zy05 {
public static void main(String[] args) {
	int a[]= {2,3,5,6,7,8,};
	BinaryFind_zy05 binary=new BinaryFind_zy05();
	binary.find(0, a.length-1,8, a);
	
}
}
class BinaryFind_zy05{
	public void find(int leftIndex,int rightIndex,int val,int a[]) {
		//首先找到中间的数
		int midIndex=(rightIndex+leftIndex)/2;
		int midVal=a[midIndex];
		//如果要找的数比midVal大
		if(rightIndex>=leftIndex) {
		 if(midVal>val) {
			//在a左边数中找
			find(leftIndex,midIndex-1,val,a);
		}else if(midVal<val) {
			//在a的右边找
			find(midIndex+1,rightIndex,val,a);
		}else if(midVal==val) {
			System.out.println("找到下标："+midIndex);
		}	
		}
		}	
}
	
