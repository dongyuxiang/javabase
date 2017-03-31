package com.dyx.javacore.ayyays;

import java.util.Scanner;

public class ArraysCaishu {
	public static void main(String[] arg){
		int[] arr={8,4,2,2,23,344,12,255};
//		BlianLi blianLi=new BlianLi();
		BlianLi.binali(arr);
		BlianLi.add(arr);
		BlianLi.caishu(arr);
}
}
class BlianLi{
	/**
	 * @param 数组的遍历
	 * */
	public static void binali(int[] arr){
	/*	System.out.print("[");
		for (int i = 0; i < arr.length; i++) {	
			if(i==arr.length-1){
				System.out.println(arr[i]+"]");
				break;
			}
			else
			System.out.print(arr[i]+",");
		}*/
		System.out.print("[");
		for(int i:arr){
			System.out.print(i+",");
		}
		System.out.println("]");
	}
	/**@param求数组的和
	 * 
	 * */
	public static void add(int[] arr){
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println("数组的和为："+sum);
	}
	/**
	 * @param 猜数字游戏
	 * */
	public static void caishu(int[] arr){
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入一个数：");
		int input=sc.nextInt();
		int a=0;
		boolean falg=false;
		for (int i = 0; i < arr.length; i++) {
			if(input==arr[i]){
				a++;
				falg=true;
			}
		}	
		if(falg){
			System.out.println("数组中有此元素，切有"+a+"个");
			
		}else{
			System.out.println("数组中没有此元素");
		}
	}
}