package com.dyx.javacore.yunsuanfu;

public class ForDemo3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//��1~10֮�������ż���� 
//		����һ������������������ż���ĺ�.����ʼ��ֵΪ��
		int sum=0;
		for(int i=1;i<=10;i++){
			if(i%2!=0)
				continue;
			sum+=i;
		}
		System.out.println("һ��ʮ֮�����е�ż����λ��"+sum);
		
	}

}
