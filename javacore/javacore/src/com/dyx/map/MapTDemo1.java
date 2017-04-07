package com.dyx.map;

public class MapTDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person<String> person1=new Person<String>();
		person1.setName("jack");
		person1.setPass("654321");
		String info1="name:"+person1.getName()+"\t"+"密码："+person1.getPass();
		System.out.println(info1);
		
		Person<Integer> person2 =new Person<Integer>();
		person2.setName("wangcai");
		person2.setPass(123456);
		String info2="name:"+person2.getName()+"\t密码:"+person2.getPass();
		System.out.println(info2);
	}
}
class Person<T>{
	private String name;
	private T pass;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public T getPass(){
		return pass;
	}
	public void setPass(T pass){
		this.pass=pass;
	}
}