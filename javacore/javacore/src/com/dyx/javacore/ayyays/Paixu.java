package com.dyx.javacore.ayyays;

import java.util.Arrays;
import java.util.Scanner;

import javax.naming.ldap.SortControl;

public class Paixu {

	public static void main(String[] args) {
		/*从键盘输入十个数，求出十个数的和*/
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入数组的长度");
		int num=scanner.nextInt();
		int[] arr=new int[num];//确定数组的长度
		PaiXuDemo.fuzhi(arr);//调用fuzhi方法，对规定长度的数组进行赋值
		System.out.print("你输入的"+num+"个数为：");
		
		PaiXuDemo.bianli(arr);//调用遍历方法，把是个元素以数组的形式遍历出来
		System.out.println("你输入的数组元素的和以及平均值为……………………");
		
		PaiXuDemo.add(arr);//调用add方法，求和以及平均值
		
		PaiXuDemo.selectsort(arr);//调用排序方法对数组就行排序
		System.out.println("数组升序后的结果为：…………………………");
		PaiXuDemo.bianli(arr);//对排序后的数组进行遍历并输出
		
		PaiXuDemo.maopaosort(arr);
		System.out.println("数组降序后的结果为：……………………");
		PaiXuDemo.bianli(arr);
		
		System.out.println("数组元素中的最大值为………………");
		PaiXuDemo.getMax(arr);
		System.out.println("数组元素中的最小值为………………");
		PaiXuDemo.getMin(arr);
	}
}
class PaiXuDemo{
	public static void fuzhi(int[] arr){
		Scanner sc=new Scanner(System.in);
		System.out.println("请依次输入数组元素：");
		for (int i = 0; i < arr.length; i++) {//从键盘输入10个数并遍历出来
			arr[i]=sc.nextInt();		
		}
	}
	public static void bianli(int[] arr){//把输入的数遍历出来
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if(i!=arr.length-1){
				System.out.print(arr[i]+",");
			}
			else{
				System.out.println(arr[i]+"]");
			}
		}
	}
	public static void add(int[] arr){//把输入的元素进行求和，求平均值运算
		int sum=0;
		double avg;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		avg=(double)sum/arr.length;
		System.out.println("元素的和为："+sum+"\t元素的平均值为:"+avg);
	}
	public static void selectsort(int[] arr){//升序      选择排序法
		for (int i = 0; i < arr.length-1; i++) {
			for (int j =i+1; j < arr.length; j++) {
				if(arr[j]<arr[i]){
					int a=arr[i];
					arr[i]=arr[j];
					arr[j]=a;
				}
			}
		}
	}
	public static void maopaosort(int[] arr){//降序    冒泡排序法
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]<arr[j+1]){
					int a=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=a;
				}
			}
		}
	}
	public static void getMax(int[] arr){//数组最大值
		int max=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println(max);
	}
	public static void getMin(int[] arr){//数组最小值
		int min=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(min>arr[i]){
				min=arr[i];
			}
		}
		System.out.println(min);
	}
}

