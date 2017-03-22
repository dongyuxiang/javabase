package com.dyx.javacore.yunsuanfu;

import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
/*		Scanner sc=new Scanner(System.in);
		System.out.print("请输入一个值：");
		int j=sc.nextInt();
		System.out.println("根据这个值输出一下内容：");
		for(int i=0;i<=6;i++){
				System.out.println(i+" + "+j+" = "+(i+j));
				j--;
			}*/
		//输入100以内的所有奇数的和
		
		int sum=0;
	for(int i=1;i<100;i++){
		if(i%2!=0){
			sum=sum+i;
		}
	}
	System.out.println(sum);		
	}
}


