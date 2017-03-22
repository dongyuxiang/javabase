package com.dyx.luojiyunsuan.birthday;

import java.util.Scanner;

public class ScoreDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入STB的成绩");
		int scoreSTB=sc.nextInt();//定义一个变量用来表示STB的课程成绩
		System.out.println("STB的成绩是："+scoreSTB);//输出STB成绩
		System.out.print("请输入Java的成绩：");
		//定义一个变量用来表示Java的课程成绩
		int scoreJava=sc.nextInt();
		//输出Java的课程成绩
		System.out.println("Java的成绩是："+scoreJava);
		System.out.print("请输出SQL的成绩：");
		//定义一个变量用来保存SQL的课程成绩
		int scoreSQL=sc.nextInt();
		//输处SQL课程成绩
		System.out.println("SQL的成绩是："+scoreSQL);
		
		System.out.println("--------------------------------------");
		System.out.println("STB\t"+"java\t"+"SQL");
		System.out.println(scoreSTB+"\t"+scoreJava+"\t"+scoreSQL);
		System.out.println("--------------------------------------");
		//计算两门课程的成绩差
		int min=scoreJava - scoreSQL;
		System.out.println("Java和SQL的成绩差："+min);
		//计算三门课程的平均分
		double avg=(scoreSTB+scoreJava+scoreSQL)/3;
		System.out.println("3门课的平均分是："+avg);
	}
}
