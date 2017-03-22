package com.dyx.luojiyunsuan.birthday;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入num的值：");
		int num=sc.nextInt();
	//for循环：
		for(int a=0;a<num;a++){
			System.out.println("我是for循环的第"+(a+1)+"次执行");
		}
	//while循环
		System.out.println("----------------------------");
		int j=0;
		while(j<num){
			System.out.println("我是while循环的第"+(j+1)+"次循环");
			j++;
		}
	//do while循环
		System.out.println("----------------------------");
		int i=0;
		do {
			System.out.println("我是do while循环的第"+(i+1)+"次循环");
			i++;
		}while(i<num);
	//foreach
		System.out.println("----------------------------");
		String[] str={"aa","bb","cc"};
		for(String string:str){
			System.out.println("元素的数组位"+string);
		}
}
}
