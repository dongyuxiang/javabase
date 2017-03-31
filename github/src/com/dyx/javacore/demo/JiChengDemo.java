package com.dyx.javacore.demo;

public class JiChengDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat=new Cat();
//		Animal animal=new Cat();
//		cat.eat();
		Cat cat2=new Cat("gou");
	}

}
class Animal{
	public Animal(){
		System.out.println("吃方法");
	}
	public Animal(String name){
		System.out.println("旺财");
	}
}
class Cat extends Animal{
	public  Cat(){
		System.out.println("吃鱼");//覆盖父类中的方法
	}
	public Cat(String name){
		System.out.println("豆豆");
	}
}
class Dog extends Animal{
	void eat(){
		System.out.println("骨头");
	}
}
