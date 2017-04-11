package com.dyx.map;

import java.lang.reflect.Field;
import java.nio.channels.NonWritableChannelException;

import org.omg.CORBA.PRIVATE_MEMBER;

import lombok.Getter;
import lombok.Setter;

public class FanSheDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Person1 person1=new Person1();
		System.out.println(person1);
		person1.setAge(8);
		System.out.println(person1);
		
		//利用反射的方式
		Class c1=Class.forName("com.dyx.map.Person1");//创建一个对象
		Object object=c1.newInstance();//调用无参构造函数
		System.out.println("object  设定属性前:"+object);
		
		//得到属性
		Field fields=c1.getDeclaredField("age");
		//设定强制访问
		fields.setAccessible(true);
		//设定属性
		fields.set(object,10);
		System.out.println("设定属性后：");
		System.out.println(object);
		System.out.println((Person1) object);//对比
	}
}
@Getter
@Setter
class Person1{
	private String name="旺财";
	private int age=5;
	public  Person1(){
	}
	public Person1(String name){
		this.name=name;
	}
	public Person1(int age){
		this.age=age;
	}
	public Person1(String name,int age){
		this.name=name;
		this.age=age;	
	}
	public String toString(String name,int age){
		this.name=name;
		this.age=age;	
		return  "name"+name+"\tage"+age;
	}
	public String toString(){
		return "[" + this.name + "  " + this.age + "]";	
	}
	public void printPersonSelf() {
		System.out.println("我是Person中的-printPersonSelf："+this.toString());
	}
}
