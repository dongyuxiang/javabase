package com.dyx.javacore.extendsdemo;

import com.sun.prism.Material;

public class Test {

	public static void main(String[] args) {
		Master master=new Master();
		Dog dog=new Dog();
		Penguin penguin=new Penguin();
//		master.feed(dog);
//		master.feed(penguin);
//		Pet pet=new Dog();
//		master.feed(pet);
//		Pet pet1=new Penguin();
//		master.feed(pet1);
		master.feed(penguin);
//      Master.feed(new Penguin());//直接调用对象时，该类对象必须是静态的
		master.feed(dog);
		
	}
}
