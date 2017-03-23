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
		System.out.println("三角形底边长度为："+((2*num)-1));
		for (int i = 1; i <=num; i++) {	
			for(int j=i;j<num;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++){
				System.out.print("*");
			}
			System.out.println("");
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
