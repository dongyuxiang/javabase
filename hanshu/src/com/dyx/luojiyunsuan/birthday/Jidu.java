package com.dyx.luojiyunsuan.birthday;

import java.util.Scanner;

public class Jidu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//从键盘输入一个数，判断是一年中的那个季度
		//2、3、4		春季
		//5、6、7		夏季
		//8、9、10	秋季
		//11、12、1	冬季
/*		System.out.println("请输入月份");
		int month=sc.nextInt();
		if(month==2 ||month==3 || month==4)
			System.out.println(month+"月是春季");
		else if(month==5 ||month==6 || month==7)
			System.out.println(month+"月是夏季");
		else if(month==8 ||month==9 || month==10)
			System.out.println(month+"月是秋季");
		else if(month==11 ||month==12 || month==1)
			System.out.println(month+"月是秋季");
		else
			System.out.println("您输入的月份不在正确范围内，请输入1-12中的一个数：");*/
		
		//能被400整除的年份 或 不能被100整除却能被4整除 的年份 是闰年.
		
		Scanner sc =new Scanner(System.in);//定义scanner，让其从键盘输入年份
		System.out.println("请输入要判断的年份");
		int year=sc.nextInt();
//		boolean a=year%400==0 ;
//		boolean b=(year%100!=0)&&(year%4==0);
		if((year%4==0)||((year%100!=0)&&(year%4==0))){
			System.out.println("您输入的是闰年，一年有366天");
		}
		else {
			System.out.println("您输入的是平年，一年有365天");
		}
		System.out.println("请输入月份：");
		int month=sc.nextInt();
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
			System.out.println(month+"月有31天");
		}
		else if(month==4||month==6||month==9||month==11){
			System.out.println(month+"月有30天");
		}
		else if(month==2&&(year%4==0)||((year%100!=0)&&(year%4==0))){
			System.out.println("今年是闰年："+month+"月有29天");
		}
		else{
			System.out.println("今年是平年："+month+"月有28天");
		}
	}
}
