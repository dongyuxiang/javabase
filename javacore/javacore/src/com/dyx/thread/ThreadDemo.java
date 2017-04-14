package com.dyx.thread;

import lombok.Getter;
import lombok.Setter;
class Demo extends Thread{
	private String  name;
	Demo(String name){
//		super(name);
		this.name=name;
	}
	public void run(){
		show();
	}
	public void show(){
		for(int x=0;x<10;x++){
//			for(long y=-999999999;y<=999999999;y++){}
			System.out.println("naem:"+name+"----"+x+"\tname:"+Thread.currentThread().getName());
		}
	}
}
public class ThreadDemo {
	public static void main(String[] args) throws Exception {
		Demo demo=new Demo("旺财");
		Demo demo1=new Demo("小强");
//		demo.setName("111111");
//		demo1.setName("22222222");
		demo.start();
		demo1.start();
		System.out.println("---"+Thread.currentThread().getName());
	}

}
