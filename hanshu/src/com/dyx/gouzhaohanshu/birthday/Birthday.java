package com.dyx.gouzhaohanshu.birthday;

public class Birthday {
	private int day,month,year;
	/**
	 * 值传递，参数为基本类型
	 * @param day
	 * @param month
	 * @param year
	 * */
	public void display(int year,int month,int day){
		day=11;		month=11;	year=2017;
		System.out.println("传递方法中："+year+"-"+month+"-"+day);	
	}
	/**
	 * 引用传递，传递的是引用类型
	 * @param birthday
	 * */
	public void display(Birthday birthday){
		birthday.year=2015;
		birthday.month=2;
		birthday.day=2;
		System.out.println("传递方法中："+birthday.year+"-"+birthday.month+"-"+birthday.day);
	}
	/**
	 * 值传递测试
	 * */
	public static void testValue1(){
		Birthday birthday=new Birthday();
		//定义三个基本类型的变量，分别是日，月，年
		int day =1,month=1,year=2017;
		//传递之前打印这三个变量
		System.out.println("传递之前："+year+"-"+month+"-"+day);
		birthday.display(year, month, day);
		//传递之后，在打印这三个变量的值
		System.out.println("传递之后："+year+"-"+month+"-"+day);
	}
	public static void testValue2(){
		Birthday birthday=new Birthday();
		birthday.day=1;
		birthday.month=1;
		birthday.year=2008;
		//传递之前打印birthday对象值
		System.out.println("传递方法之前："+birthday.year+"-"+birthday.month+"-"+birthday.day);
		//传递birthday对象到display方法中，并在方法中改变birthday的值
		birthday.display(birthday);
		//传递之后，在打印birthday的值
		System.out.println("传递之后："+birthday.year+"-"+birthday.month+"-"+birthday.day);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		testValue1();
		testValue2();
	}

}
