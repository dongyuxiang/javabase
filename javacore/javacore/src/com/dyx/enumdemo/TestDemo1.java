package com.dyx.enumdemo;

import java.time.temporal.WeekFields;

public class TestDemo1 {

	public static void main(String[] args) {
		//对EnumDemo进行遍历输出
		System.out.println("使用foreach遍历输出EnumDemo1");
/*		for(EnumDemo1 en:EnumDemo1.values()){
//			System.out.println(en);
			System.out.println(en.name()+"---"+en.ordinal());
		}*/
		for( EnumDemo1 en : EnumDemo1.values()) {
			System.out.println(en.name()+"---"+en.ordinal()+"---"+en.getValue()+"---"+en.getWeek());
		}
		System.out.println("利用switch case分支语句打印");
		EnumDemo1 enumDemo1 =EnumDemo1.SAT;
		switch(enumDemo1){
		case SAT:    System.out.println("SAT："+enumDemo1.getWeek());break;
		case SUN:    System.out.println("SUN"+enumDemo1.getWeek());break;
		default:		break;
		}
		EnumDemo2 enumJiekou=EnumDemo2.SUN;
		enumJiekou.print();
		System.out.println(enumJiekou.getInfo());
	}
}
