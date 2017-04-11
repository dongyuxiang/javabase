package com.dyx.zhujie;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class Son extends person{
	@SonName("张zhang")
	private String name="李四";
	@Default("60")
	private Integer age=30;
	@Default("99.9")
	private double score=89.5;
	public Son() {
	
	}
	public Son(int age){
		this.age=age;
	}	
	public Son(String name){
		this.name=name;
	}
	public Son(int age,String name){
	this.age=age;
	this.name=name;
	}
//@Override
//@Deprecated
	public void show() {	
		System.out.println("person [name=" + name + ", score=" + score +", age "+age+ ", getName()=" + getName() + ", getScore()=" + getScore() +", getAge"+age+ "]"); 
	}
}
