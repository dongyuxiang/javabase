package com.dyx.thread;

import java.io.Externalizable;
import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;

public class GuituSaiPao {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入a的是速度");
		int a=sc.nextInt();
		System.out.println("输入b的是速度");
		int b=sc.nextInt();//6米每秒
		int n = 0,l=0;
		if(a<b){
			System.out.println("输入a先跑的时间");
		  n=sc.nextInt();//a先跑的时间 
		   l=a*n;
		  System.out.println("a先跑了："+l+"米");
		  for(int m=1;m<100;m++){
			  if((l+a*m)==(b*m)){
				  System.out.println(m+"秒时两人相遇");
				  break;
			  }else{
				  int cha=(l+a*m)-b*m;
				  System.out.println(m+"秒时相差"+cha+"\t");
			  }
		  }
		}else{
			System.out.println("输入b先跑的时间");
			n=sc.nextInt();//b先跑的时间
			 l=b*n;
			  System.out.println("b先跑了："+l+"米");
			  for(int m=1;m<100;m++){
				  if((l+b*m)==(a*m)){
					  System.out.println(m+"秒时两人相遇");
					  break;
				  }else{
					  int cha=(l+b*m)-a*m;
					  System.out.println(m+"秒时相差"+cha+"\t");
				  }
			  }
		}
		
		
//		int la=a*m,lb=b*m;
//		while()
	}
}
@Getter
@Setter
class SaiPao{
	//分别定义两个对象的速度
	 
}