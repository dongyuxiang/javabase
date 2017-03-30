package com.dyx.javacore.exception;

import java.util.Scanner;

import org.apache.log4j.jmx.Agent;

import java.lang.Exception;

public class Exception2 {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		/* int ret=1;
		try {
			ret = div();
		} catch (java.lang.Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("返回的结果是："+ret);*/
		try {
			exThrow(-5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static int div() throws Exception {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入两个数："); 
		
			int num1=input.nextInt();	  
			int num2=input.nextInt();
			System.out.println("num1/num2的结果是："+num1/num2);
			return 0;
	}
	public static void exThrow(int age) throws Exception{
		if(age<0){
			throw new Exception("age不能小于0"); 
		}else{
			System.out.println("age="+age);
		}
	}

}
