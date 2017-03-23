package com.dyx.javacore.yunsuanfu;

import java.util.Scanner;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int arr[]={12,3,5,7};
		for(int a:arr){
			System.out.println(a);
		}*/
		//定义一个sum变量用来存储和
/*		int sum=0;
		for(int i=1;i<=100;i++){//i表示1到100之间的数值
			sum+=i;
		}
		System.out.println("1-100之间的和为："+sum);*/
		//一到一百之间所有奇数之和
		//定义两个变量一个变量用来保存和，另一个用来表示数值
/*		for(int i=1;i<=100;i++){
			if(i%2==0)
				continue;
			sum+=i;
		}
		System.out.println(sum);*/
		
/*		int sum=0;
		for(int i=1;i<=100;i+=6){
			while(i<100){
				i+=6;
			System.out.println(i);
			}
		}*/
		//输出一个等腰三角形
/*		     ++++*
		     +++***
		     ++*****
		     +********/
		Scanner sc=new Scanner(System.in);
		System.out.print("请输出等腰三角形边长:");
		int num=sc.nextInt();
		for(int i=0;i<num;i++){
			for(int j=i;j<num;j++){
				if(j==num-1){
					System.out.print("*");
					break;
				}
				System.out.print(" ");
			}
			for(int z=1,a=1;z<=i;z++,a++){
				System.out.print("**");
			}
				System.out.println();
		/*		if(i==0){
					System.out.print("*");
					break;
				}*/
/*			for(int a=1;a<=i;a++){
			System.out.print("*");
			}*/
		}
	}
}
