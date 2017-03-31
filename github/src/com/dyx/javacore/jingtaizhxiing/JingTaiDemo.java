package com.dyx.javacore.jingtaizhxiing;

import com.sun.java.swing.plaf.windows.WindowsTableHeaderUI;
import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;
import com.sun.org.glassfish.external.statistics.Statistic;

public class JingTaiDemo {

	public static void main(String[] args) {
		Lisi lisi=new Lisi();
	}
}
abstract class Person{
	static Student student=new Student("我是静态属性");
	String name;
	int age;
	public Person(){
//		super();
		System.out.println("我是person无参语句块，-----执行");
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("我是person有参语句块，-----执行");
	}
	
}
class Lisi extends Person{
	public Lisi(){
		super();
		System.out.println("Lisi,类的无参构造函数------执行");
	}
	public Lisi(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("我是lisi有参语句块，-----执行");
	}
}
class Student{
	String name;
	int age;
	public Student(String name){
		this.name=name;
		System.out.println("student ,构造函数---"+name);
	}
	
}