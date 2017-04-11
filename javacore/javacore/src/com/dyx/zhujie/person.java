package com.dyx.zhujie;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class person {
	private Integer age=50;
	private String name="张三";
	public  person() {
		// TODO Auto-generated constructor stub
	}
	public person(int age){
		this.age=age;
	}
	public person(String name){
		this.name=name;
	}
	public person(int age,String name){
		this.age=age;
		this.name=name;
	}
	@Deprecated
	public void show() {
		System.out.println("person [name=" + name + ", age=" + age+"]"); 
	}
}
