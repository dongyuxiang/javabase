package com.dyx.javacore.yunsuanfu;
import java.util.Scanner;

public class ForDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("�༶��������");
		int num=sc.nextInt();
		int c=0;//c��ʾ�ɼ���80�����ϵ��ˡ�
		for(int i=1;i<=num;i++){
			System.out.print("��"+i+"λѧ���ĳɼ���");
			int score=sc.nextInt();
			if(score<80){
				continue;
			}
			if(score>=80){
				c=c+1;
			}
		}
		double b=(c*1.0/num)*100;
		System.out.println("80�����ϵ�����Ϊ:"+c);
		System.out.println("80�����ϵ���ռ�ñ���Ϊ��"+String.format("%.1f", b)+"%");
	}

}
