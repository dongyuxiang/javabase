package com.dyx.javacore;

import java.util.Arrays;

import com.dyx.javacore.yunsuanfu.ForDemo;

public class PaixuDemo {
	public static void main(String[] args) {
		int[] score={56,98,96,45,78};
		System.out.println("数组的初始顺序");
		bianli(score);
		Arrays.sort(score);
		System.out.println("数组排序之后的结果为");
		bianli(score);
		
		int[] score2=new int[5];
		System.out.println("复制Score之后Score2的结果为");
		 score2=Arrays.copyOf(score, 5);
		bianli(score2);
		
		int[] score3=new int[5];
		System.out.println("使用System里的方法进行copy");
		 
		bianli(score3);
		
	System.out.println("使用foreach循环之后的结果");
		for(int i:score){
//			System.out.println("score["+"i"+"]="+score[i]);
			System.out.println(i);
		}
	}
	public static void bianli(int[] score){
		for(int i=0;i<score.length;i++){
			System.out.println("score["+"i"+"]="+score[i]);
		}
	}		
}
