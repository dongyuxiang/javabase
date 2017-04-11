package com.dyx.map;

import java.awt.print.Printable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Handler;

import lombok.Getter;
import lombok.Setter;

public class FanSheAnimalDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		//三种种获取类的方法
		Class c1=Animal.class;
		Class c2=Class.forName("com.dyx.map.Animal");
		Class c3=new Animal().getClass();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		//利用反射创建Animial的实例
		Animal obj=(Animal)c1.newInstance();
		//获取全部的构造函数
		Constructor[] con=c1.getDeclaredConstructors();
		for(Constructor cons:con){
			System.out.println(cons);
		}
		//获取全部的属性
		System.out.println("获取全部的属性");
		Field field=c1.getDeclaredField("name");//获取指定的属性
		System.out.println(field);
		Field[] fi=c2.getDeclaredFields();//利用递归获取所有的属性
		for(Field fid:fi){					//暴力访问
			System.out.println(fid);
		}
		//获取全部的方法
		System.out.println("获取全部方法");
		Method[] me=c3.getDeclaredMethods();//；利用递归获取所有的方法
		for(Method mes:me){
			System.out.println(mes);
		}
		System.out.println();
		//获取单个属性并修改其内容
		Field fname =c1.getDeclaredField("name");
		fname.setAccessible(true);
		fname.set(obj, "豆豆");
		System.out.println("fanme.get()"+fname.get(obj));
		
		Field fage =c1.getDeclaredField("sex");
		fage.setAccessible(true);
		fage.set(obj, '雌');
		System.out.println("fage.get()"+fage.get(obj));
		//唤醒print方法
		Method method=c1.getMethod("print");
		method.invoke(obj);//因为print方法中没有输出语句
		System.out.println(obj.print());//所以需要对结果进行输出
	}
}
@Setter
@Getter
class Animal{
	private String name="旺财";
	private char sex='雄';
	public Animal(){	
	}
	public Animal(String name){
		this.name=name;
	}
	public Animal(char sex){
		this.sex=sex;
	}
	public Animal(String name,char sex){
		this.name=name;
		this.sex=sex;
	}
	public String print(){
		return "["+this.name+"\t"+this.sex+"]";
	}
}
