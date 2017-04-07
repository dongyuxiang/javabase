package com.dyx.javacore.fenzhuang;

public class FenZhuangDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Person().setAge(150);
		new Person().getAge();
	}

}
class Person{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>0 && age<130){
		this.age = age;
		}
		else {
			System.out.println("输入的年龄有误");
		}
	}
	
}
