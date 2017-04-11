package com.dyx.javacore.extendsdemo;

import javax.swing.text.GapContent;

import com.sun.corba.se.spi.orb.StringPair;

public class Penguin extends Pet {

	public Penguin(){
		super();
	}
	public Penguin(String name){
		super(name);
	}
	public Penguin(String name,int age,int love) {
		super(name,age,love);
	}

	public void eat(){
		System.out.println("企鹅吃鱼");
	}
 
}
