package com.dyx.thread;

public class MyRuableDemo implements Runnable {
	public void run() {
		System.out.println("当前线程名称："+Thread.currentThread().getName());
		for(int x=0;x<100;x++){
			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getName()+"--"+x);
			//currentThread()是返回对当前正在执行的对象的应用      再通过getName()获取房钱正在执行的对象的名字
		}
	}
}
	