package com.dyx.luojiyunsuan.birthday;

import java.util.Scanner;

public class Brand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		使用if结构和switch结构分别实现：奥巴马同学父亲为了鼓励他的学习，决定采用奖励来激励他
		如果奥巴马的考试成绩==100分，父亲给她买辆车
		如果奥巴马的考试成绩>=90分，母亲给她买台笔记本电脑
		如果奥巴马的考试成绩>=60分，母亲给她买部手机
		如果奥巴马的考试成绩<60分，没有礼物 
		如果奥巴马的考试成绩<30分，赏赐30大板*/
		//定义一个Scanner用来从键盘输入成绩
		Scanner sc= new Scanner(System.in);
		System.out.println("请输入奥巴马的成绩：");
		int score =sc.nextInt();
		if(score==100)
			System.out.println("奥巴马的父亲给他买辆小汽车");
		else if(score>=90)
			System.out.println("奥巴马的母亲给他买台电脑");
		else if(score>=60)
			System.out.println("奥巴马的母亲给他买部手机");
		else if(30<score && score<60)
			System.out.println("没人给奥巴马买礼物");
		else
			System.out.println("奥巴马不敢回家");
		//利用switch语句时先
		//利用Scanner从键盘输入成绩
		System.out.println("--------------------");
		System.out.println("请输入奥巴马的成绩");
		int score1 =sc.nextInt();
//		int n= score1/10;
		switch(score1/10){
		case 10: System.out.println("奥巴马的父亲给他买辆小汽车");break;
		case 9: System.out.println("奥巴马的母亲给他买台电脑");break;
		case 6: System.out.println("奥巴马的母亲给他买部手机");break;
		case 3: System.out.println("没人给奥巴马买礼物");break;
		default: System.out.println("不敢回家");break;
//		case 1: System.out.println("奥巴马的父亲给他买辆小汽车");break;
//		case 1: System.out.println("奥巴马的父亲给他买辆小汽车");break;
		
		}
	}

}
