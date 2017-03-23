package com.dyx.javacore.yunsuanfu;

import java.util.Scanner;

public class Administrator {

	public static void main(String[] args) {
		Administrator1 user=new Administrator1();
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入 用户名：");
		user.userName=sc.next();
		System.out.print("请输入密码：");
		user.passWord=sc.next();
		user.load();
	}

}
class Administrator1 {
	
	String userName,passWord;
	public void load(){
		Scanner sc=new Scanner(System.in);
		int i=2;
	while(!"root".equals(userName)  || !"root".equals(passWord)){
		while(i>=0){
		System.out.println("登录失败，您输入的信息有误,你还有"+i+"次机会\n");
		if(i==0){
			System.out.println("对不起你三次均输入错误，十分钟后再试");
			return;
			}
		i--;
		break;
		}
		System.out.print("请输入 用户名：");
		userName=sc.next();
		System.out.print("请输入密码：");
		passWord=sc.next();
		}	
	System.out.println("欢迎进入系统");
	}
}
