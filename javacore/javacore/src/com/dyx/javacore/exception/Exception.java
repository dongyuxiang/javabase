package com.dyx.javacore.exception;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入两个数：");
		try {
			int num1=input.nextInt();	  
			int num2=input.nextInt();
			System.out.println("num1/num2的结果是："+num1/num2);
		} catch (ArithmeticException ari) {
			// TODO: handle exception
			System.out.println("我捕获到算术异常");
			ari.printStackTrace();
		}catch (InputMismatchException inp) {
			// TODO: handle exception
			System.out.println("我捕获到了输入不匹配异常");
			inp.printStackTrace();
		}
		catch (java.lang.Exception e) {
			System.out.println("我捕获到了异常");
			System.out.println(e.getClass().getName());
//			e.printStackTrace();
		}
		System.out.println("我被执行到了，程序结束");
	}
	
}
