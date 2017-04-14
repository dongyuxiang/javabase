package com.dyx.javacore.duxiang.administrator;

import java.util.Scanner;

import com.sun.jndi.url.dns.dnsURLContextFactory;

public class Administrator {
	public static void main(String[] args) {
		Administratordemo1 a =new Administratordemo1();
		Scanner sc =new Scanner(System.in);

		a.showName();
	}
	
}
class Administratordemo1{
	String name;
	int passWord;
	public void showName(){
		name="abc";passWord=123;
		System.out.println("姓名："+name+",密码："+passWord);
		name="dyx";passWord=233;
		System.out.println("姓名："+name+",密码："+passWord);
	}
}
