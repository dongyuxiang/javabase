package com.dyx.thread;

public class MyThreadDemo extends Thread {

	@Override
	public void run() {
		System.out.println("当前的线程名："+Thread.currentThread().getName());//currenthread返回对当前正在执行的线程对象的引用
		for(int i=0;i<=100;i++){
			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getName()+"--"+i);
		}
	}

}
