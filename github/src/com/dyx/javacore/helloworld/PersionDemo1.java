package com.dyx.javacore.helloworld;

public class PersionDemo1 {
	private String name="旺财";
	private int age = 6;
	private boolean marry = false;
	//无参构造函数
	public PersionDemo1(){}
	//有参构造函数
	public PersionDemo1(String str,int a,boolean f){
		name=str;
		age=a;
		marry=f;
	}
	public void display(){
	System.out.println(name+"\t"+age+"\t"+marry+"\t");
	}
	
	public static void main(String[] args) 
	{
		//使用无参构造函数
		String name="豆豆";
		int age=6;
		boolean marry =true;
		System.out.println(name+"\t"+age+"\t"+marry+"\t");
//		PersionDemo1 persion1=new PersionDemo1();
//		persion1.display();
		
		//使用有参构造函数
		System.out.println("使用有参构造函数：");
		PersionDemo1 persion=new PersionDemo1("wang",9,true);
		persion.display();
	}
}