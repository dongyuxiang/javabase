package com.dyx.javacore.yunsuanfu;

import java.util.Scanner;

public class ForDemo1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//ѭ������ĳͬѧ��һѧ�ڽ�ҵ���Ե�5�ſγɼ���������ƽ����
		System.out.print("������ѧ��������");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		int sum=0,i;
		for( i=1;i<=5;i++){
			System.out.print("���������ſγ��еĵ�"+i+"�ųɼ�:");
			int num=sc.nextInt();
			if(num<0){
				System.out.println("������������,���������룺");
				break;
			}
			sum=sum+num;
		}
		double avg=sum/i;
		System.out.println(name+"ͬѧ���ſγ̵�ƽ���ɼ�Ϊ��"+avg);
		
	}

}
