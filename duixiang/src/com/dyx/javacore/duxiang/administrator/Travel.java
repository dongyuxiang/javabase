package com.dyx.javacore.duxiang.administrator;

import java.util.Scanner;

public class Travel {
		String name;
		int age;
		public void showPersion(){
			Scanner sc=new Scanner(System.in);
			while(!"n".equals(name)){
			if(age>=20 && age<=50){
				System.out.println("游客年龄："+age+"\t您的年龄达到买票标准，请买票,价格为20元");
			}
			else {
				System.out.println("恭喜您，您可以免费进入");
			}
			System.out.print("请输入姓名：");
			name=sc.next();
			if(!"n".equals(name)){
			System.out.print("请输入年龄：");
			age=sc.nextInt();
			}
		}
			System.out.println("退出程序");
	}
}
