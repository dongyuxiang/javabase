package com.dyx.javacore.jiafa;

import java.util.Scanner;

import com.sun.javafx.geom.AreaOp.AddOp;
import com.sun.org.apache.xpath.internal.operations.Equals;

public class JiaFa {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);//定义一个Scanner,用来输入要计算的数以及运算符
		System.out.print("请输入第一个数：");
		int a=sc.nextInt();//输入第一个数
		System.out.print("请输入运算符号：");
		String string=sc.next();//输入相应的运算符
		System.out.print("请输入第二个数：");
		int b=sc.nextInt();//输入第二个数
		Shua s=new Shua();//定义一个对象用来调用加减乘除的算法
		int he,cha,ji;//定义几个变量，用来存储计算结果
		double shang;
		if("+".equals(string)){//通过eauals方法来判断输入的符号，以方便调用相应的方法，并输出
			he =s.add(a,b);
			System.out.print(a+"+"+b+"="+he);
		}
		if("_".equals(string)){
			cha=s.jian(a, b);
			System.out.print(a+"-"+b+"="+cha);
		}
		if("*".equals(string)){
			ji=s.cheng(a,b);
			System.out.print(a+"*"+b+"="+ji);
		}
		if("/".equals(string)){
			shang=s.chu(a, b);
			System.out.print(a+"/"+b+"="+shang);
		}
	}
}
class Shua {//定义shua这个类用来存储加减乘除的具体实现方法
	int add(int a,int b){//定义加法方法
		return a+b;
	}
	int jian(int a,int b){//定义减法方法
		return a-b;
	}
	int cheng(int a,int b){//定义乘法方法
	return a*b;
	}
	double chu(double a,double b){//定义除法方法
		return a/b;
		
	}
}