package com.dyx.javacore.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ret=dir();
		System.out.println("返回的结果是："+ret);
	}

	public static int  dir() {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入两个数："); 
		try {
			int num1=input.nextInt();	  
			int num2=input.nextInt();
			System.out.println("num1/num2的结果是："+num1/num2);
			return 0;
		} catch (ArithmeticException ari) {
			// TODO: handle exception
			System.out.println("我捕获到算术异常");
			ari.printStackTrace();
			System.exit(0);
			return 1;
		}catch (InputMismatchException inp) {
			// TODO: handle exception
			System.out.println("我捕获到了输入不匹配异常");
			inp.printStackTrace();
			return 2;
		}
		catch (java.lang.Exception e) {
			System.out.println("我捕获到了异常");
			System.out.println(e.getClass().getName());
			return 3;
//		e.printStackTrace();
		}
		finally {
			System.out.println("我是finally，我被执行了");
//			return 4;
		}
	}
}

