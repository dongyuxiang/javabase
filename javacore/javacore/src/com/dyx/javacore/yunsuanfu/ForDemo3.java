package com.dyx.javacore.yunsuanfu;

public class ForDemo3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//求1~10之间的所有偶数和 
//		定义一个变量用来保存所有偶数的和.并初始化值为零
		int sum=0;
		for(int i=1;i<=10;i++){
			if(i%2!=0)
				continue;
			sum+=i;
		}
		System.out.println("一到十之间所有的偶数和位："+sum);
		
	}

}
