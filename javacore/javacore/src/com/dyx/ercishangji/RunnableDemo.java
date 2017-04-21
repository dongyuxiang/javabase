package com.dyx.ercishangji;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunnableDemo {
/*	打印乘法口诀表到文件中。
	要求：
	A.创建一个普通类，类里有一个普通的方法，打印乘法口诀表的方法；
	B.在另一个测试类中，创建一个实现Runnable接口的线程；
	C.在run()方法中，使用反射唤醒打印乘法口诀表的方法；
	D.启动线程，打印乘法口诀表到文件中！*/
	public static void main(String[] args) throws IOException {
		ThreadDemo th= new ThreadDemo();
		Thread t=new Thread(th);
		t.start();		
	}
}
class ThreadDemo implements Runnable{

	@Override
	public void run() {
		Class c1=ChenFaBiao.class;
		try {
			Method m1=c1.getDeclaredMethod("chenFaBiao");
			Object obj=c1.newInstance();
			m1.invoke(obj);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
}
