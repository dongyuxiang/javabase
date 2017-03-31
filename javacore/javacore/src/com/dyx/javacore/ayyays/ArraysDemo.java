package com.dyx.javacore.ayyays;

import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[4];
		int sum = 0;
		double avg;
		Scanner input=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			System.out.println("请输入第一个"+i+"数");
			arr[i]=input.nextInt();
			 sum+=arr[i];
			}
		avg=(double)sum/arr.length;
		System.out.println(avg);
	}
}
