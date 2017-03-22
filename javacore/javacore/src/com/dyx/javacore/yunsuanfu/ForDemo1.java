package com.dyx.javacore.yunsuanfu;

import java.util.Scanner;

public class ForDemo1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//循环输入某同学第一学期结业考试的5门课成绩，并计算平均分
		System.out.print("请输入学生姓名：");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		int sum=0,i;
		for( i=1;i<=5;i++){
			System.out.print("请输入五门课程中的第"+i+"门成绩:");
			int num=sc.nextInt();
			if(num<0){
				System.out.println("分数输入有误,请重新输入：");
				break;
			}
			sum=sum+num;
		}
		double avg=sum/i;
		System.out.println(name+"同学五门课程的平均成绩为："+avg);
		
	}

}
