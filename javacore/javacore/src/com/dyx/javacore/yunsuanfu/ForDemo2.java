package com.dyx.javacore.yunsuanfu;

import java.util.Scanner;

public class ForDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("班级总人数：");
		int num=sc.nextInt();
		int a=0,c=0;double b = 0;
		for(int i=1;i<=num;i++){
			System.out.print("第"+i+"位学生的成绩：");
			int score=sc.nextInt();
			if(score<80){
				continue;
			}
			if(score>=80){
				c=c+1;
				a+=score;
			}
		}
		b=c/num;
		System.out.println("80分以上的人数为:"+c);
		System.out.println("80分以上的人占得比例为："+b);
	}

}
