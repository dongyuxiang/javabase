package com.dyx.javacore.yunsuanfu;

import java.util.Scanner;

public class Administrator {

	public static void main(String[] args) {
		Administrator1 user=new Administrator1();
		Scanner sc=new Scanner(System.in);
		System.out.print("������ �û�����");
		user.userName=sc.next();
		System.out.print("���������룺");
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
		System.out.println("��¼ʧ�ܣ����������Ϣ����,�㻹��"+i+"�λ���\n");
		if(i==0){
			System.out.println("�Բ��������ξ��������ʮ���Ӻ�����");
			return;
			}
		i--;
		break;
		}
		System.out.print("������ �û�����");
		userName=sc.next();
		System.out.print("���������룺");
		passWord=sc.next();
		}	
	System.out.println("��ӭ����ϵͳ");
	}
}
