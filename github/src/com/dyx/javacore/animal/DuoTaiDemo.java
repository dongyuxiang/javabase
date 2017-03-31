package com.dyx.javacore.animal;

public class DuoTaiDemo {

	public static void main(String[] args) {
		Dog dog=new Dog();
		Cat cat=new Cat();
		
		Method method=new Method();
		method.eat(dog);
		method.eat(cat);
		}
}
