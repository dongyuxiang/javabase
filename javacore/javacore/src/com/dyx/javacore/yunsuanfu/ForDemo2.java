package com.dyx.javacore.yunsuanfu;
import java.util.Scanner;

public class ForDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("班级总人数：");
		int num=sc.nextInt();
		int c=0;//c表示成绩在80分以上的人。
		for(int i=1;i<=num;i++){
			System.out.print("第"+i+"位学生的成绩：");
			int score=sc.nextInt();
			if(score<80){
				continue;
			}
			if(score>=80){
				c=c+1;
			}
		}
		double b=(c*1.0/num)*100;
		System.out.println("80分以上的人数为:"+c);
		System.out.println("80分以上的人占得比例为："+String.format("%.1f", b)+"%");
	}

}
