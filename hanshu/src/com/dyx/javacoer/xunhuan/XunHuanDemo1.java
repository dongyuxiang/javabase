package com.dyx.javacoer.xunhuan;

import java.util.Scanner;

public class XunHuanDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		山上有一口缸可以装50升水，现在有15升水。老和尚叫小和尚下山挑水，每次可以挑5升。
		问：小和尚要挑几次水才可以把水缸挑满?通过编程解决这个问题。
		提示如下： 
		(1) 用整型变量water表示水缸里的水”int water=15;”
		(2) 用整型变量i表示小和尚下山挑水的次数“int i=0;”
		(3) 分析循环条件(水少于50升)，循环操作(水增加5升，挑水次数增加1)．
		(4) 套用while循环(或d0-while循环)写出代码．*/
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入缸的容量：");
		int num=sc.nextInt();
/*		int water=15;
		int i=0;
		//利用for循环进行解答
		for(water=15;water<num;){
			water+=5;
			i++;
			System.out.println("和尚挑了"+i+"次");
		}*/
		//do while 方法
		int water=15;
		int i=0;
		do{
			i++;
			System.out.println("和尚挑了"+i+"次");
			water+=5;
		}while(water<num);
		//while方法
		/*int water=15;
		int i=0;
		while(water<num){
			water+=5;
			i++;
			System.out.println("和尚挑了"+i+"次");
		}
	*/
	}
}
