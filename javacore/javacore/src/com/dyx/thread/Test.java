package com.dyx.thread;

public class Test {

	public static void main(String[] args) {
/*		Thread thread=new MyThreadDemo();//向上转型
		thread.setName("MyThreadDemo23");
		thread.start();
		
		Thread runnable=new Thread(new MyRuableDemo());//
		runnable.setName("MyRuncble23");
		runnable.start();*/
		System.out.println("main 开始运行");
		MyThread t1=new MyThread(50);
		t1.setName("t1");
		t1.start();
		MyThread t2=new MyThread(50);
		t2.setName("t2");
		t2.start();
	}
}
class MyThread extends Thread{
	private int n=0;
	 MyThread(int n){
		this.n=n;
	}
	public void run(){
		String threadName=Thread.currentThread().getName();
		System.out.println(threadName+"开始运行");
		for(int i=1;i<=n;i++){
			System.out.print(threadName+"--"+i+"\t");
			if((i%10)==0){
				System.out.println();
			}
		}
		System.out.println(threadName+"运行完成");
	}
}
