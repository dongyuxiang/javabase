package com.dyx.javacore.yunsuanfu;

import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
/*		Scanner sc=new Scanner(System.in);
		System.out.print("������һ��ֵ��");
		int j=sc.nextInt();
		System.out.println("�������ֵ���һ�����ݣ�");
		for(int i=0;i<=6;i++){
				System.out.println(i+" + "+j+" = "+(i+j));
				j--;
			}*/
		//����100���ڵ����������ĺ�
		
		int sum=0;
	for(int i=1;i<100;i++){
		if(i%2!=0){
			sum=sum+i;
		}
	}
	System.out.println(sum);		
	}
}


