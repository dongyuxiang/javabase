package com.dyx.luojiyunsuan.birthday;

import java.util.Scanner;

public class Loop2 {
	public static void forDemo(int num){
		for(int a=0;a<num;a++){
			System.out.println("我是for循环的第"+(a+1)+"次执行");
		}
	}
	private static void whileDemo1(int num) {
		int j=0;
		while(j<num){
			System.out.println("我是while循环的第"+(j+1)+"次循环");
			j++;
		}
	}
	public static void doWhileDemo(int num){
		int i=0;
		do {
			System.out.println("我是do while循环的第"+(i+1)+"次循环");
			i++;
		}while(i<num);
		
	}
	public static void stringDemo(){
		String[] str={"aa","bb","cc"};
		for(String string:str){		
/*			1.String：表示你要遍历的集合的类型
			2.str：表示你要遍历的集合名
			3.string:表示你每遍历一个元素，便存储到该变量中，然后在foreach语句的{}使用string变量*/
			System.out.println("元素的数组位"+string);
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入num的值：");
		int num=sc.nextInt();
	//for循环：
		forDemo(num);
	//while循环
		System.out.println("----------------------------");
		whileDemo1(num);
	//do while循环
		System.out.println("----------------------------");
		doWhileDemo(num);
	//foreach循环
		System.out.println("----------------------------");
		stringDemo();
		}
}
