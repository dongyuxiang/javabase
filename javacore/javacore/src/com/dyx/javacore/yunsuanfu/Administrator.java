package com.dyx.javacore.yunsuanfu;

public class Administrator {
	String userName;
	String passWord;
	public void load(){
		if(userName=="root" && passWord=="root"){
			System.out.println("登录成功");
		}
		else{
			System.out.println("登录失败");
		}
	}
}
