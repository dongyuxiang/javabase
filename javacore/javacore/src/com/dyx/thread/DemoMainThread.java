package com.dyx.thread;

import java.io.PrintStream;

public class DemoMainThread {

	public static void main(String[] args) throws Exception {
/*		PrintStream out = System.out;
		Thread thread = Thread.currentThread();
		thread.setName("稳的一批");
		out.println("thread.getName() : " + thread.getName());//返回了当前线程的名字
		out.println("thread.getId() : " + thread.getId());//返回线程的标识符
		out.println("thread.getPriority() : " + thread.getPriority());//线程的优先级
		out.println("thread.isAlive() : " + thread.isAlive());//判断线程是否处于活动状态
		out.println("thread.isDaemon() : " + thread.isDaemon());//判断是否是守护线程
		out.println("thread.isInterrupted() : " + thread.isInterrupted());//判断线程是否已经中断
		out.println("thread.getThreadGroup() : " + thread.getThreadGroup());//返回该线程所属的线程组
		out.println("Thread.MAX_PRIORITY : " + Thread.MAX_PRIORITY);//最高优先级
		out.println("Thread.MIN_PRIORITY : " + Thread.MIN_PRIORITY);//最低优先级
		out.println("Thread.NORM_PRIORITY : " + Thread.NORM_PRIORITY);//默认优先级
		out.println("将休眠5秒");
		long start = System.currentTimeMillis();
		out.println("当前时间的毫秒是：" + start);
		Thread.sleep(5000);
		// long end = ;
		long end = System.currentTimeMillis();
		out.println("休眠时间结束的毫秒是：" + end);
		out.println("休眠5秒结束");
		System.out.println("总计时间：" + (end - start));
		out.println("即将调用：Thread.yield()");
		thread.yield(); // 让出CPU
		out.println("调用：Thread.yield()结束！");*/

		// 实现Runnable接口的方式
		Thread myRunable = new Thread(new MyRuableDemo());
//		myRunable.setName("MyRunable");
//		myRunable.setDaemon(true);	//设置为后台线程
//		myRunable.start();
//		System.out.println("myRunable.isDaemon():" + myRunable.isDaemon());
		System.out.println("计时开始");
		for(int i=1;i<=100;i++){
			Thread.sleep(1000);    //休眠时间
		System.out.print(i+"s\t");
		if((i%10)==0){
			System.out.println();
		}
	}
		System.out.println("计时完成");
		//修改为后台守护线程
	}

}
