package com.dyx.javacore.yunsuanfu;

import java.util.Scanner;

public class Denbian {

	public static void main(String[] args) {
		
	 /*  ++++*					分解：图一	++++  图二	*  图三
	     +++***						  	+++		   **     *
	     ++*****						++	 	  ***	  **
	     +******* 						+        ****	  ***
	     */
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("请输出等腰三角形的高:");
		int num=sc.nextInt();
//		System.out.println("三角形底边长度为："+((2*num)-1));
		for (int y= 1; y<=num; y++) {	
			for(int x=1;x<=2*num-1;x++){
				if((y>=num-x+1)&&(y>=x-num+1)){
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		/*	for(int z=0;z<=i;z++){
				System.out.print("*");
			}
			for(int a=1;a<=i;a++){
				System.out.print("*");
			}
			System.out.println();
		}*/
	}
}
