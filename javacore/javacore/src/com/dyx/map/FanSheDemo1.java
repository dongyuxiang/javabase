package com.dyx.map;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import lombok.Getter;
import lombok.Setter;

public class FanSheDemo1 {
	public static void main(String[] atgs) throws Exception{
		//第一种得到class实例的方法
		Class c1=Class.forName("com.dyx.map.Person1");
		//第二种得到class实例的方法  ，类名.class
		Class c2=Person1.class;
		//第三种得到class的方法      对象名.getClass
		Class c3=new Person1().getClass();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(c1.getName());//输出实例对应的包名，不包含Class前缀
		System.out.println(c2.getName());
		System.out.println(c3.getName());
		
		System.out.println("class1.getModifiers() :" + c1.getModifiers());//获取实例的修饰符
		System.out.println("class1.getSimpleName() :" + c1.getSimpleName());//对应的类名
		System.out.println("class1.getTypeName() :" + c1.getTypeName());//类名以及对应的包名
		System.out.println("class1.getClassLoader() :" + c1.getClassLoader()); //Class.getClassLoader()返回的数组类的类加载器与其元素类型的类加载器相同; 如果元素类型是原始类型，则数组类没有类加载器。 

		System.out.println("该类拥有的属性：");//属性如name，age
		System.out.println("class1.getDeclaredFields():");
		Field[] fields = c1.getDeclaredFields();
		for (Field field : fields) {
			System.out.println("field : " + field);
		}
		
		System.out.println("该类拥有的方法：");
		System.out.println("c1.getDeclaredMethods() :");
		Method[] methods=c1.getDeclaredMethods();//该类拥有的方法
		for(Method method:methods){
			System.out.println("metoh:"+method);
		}
		
		//利用反射创建Person1类的实例
		Person1 obj=(Person1) c1.newInstance();
		//访问指定的字段
		Field fname=c1.getDeclaredField("name");
		Field fage=c1.getDeclaredField("age");
		fname.setAccessible(true);
		fname.set(obj, "小强");
		System.out.println("fname.get(obj) :" + fname.get(obj));
		fage.setAccessible(true);
		System.out.println("fage.getobj():"+fage.get(obj));
		
		System.out.println("通过反射设定属性");
		fname.set(obj, "豆豆");
		fage.set(obj, 23);
		System.out.println(fname.get(obj));
		System.out.println(fage.get(obj));
		
		System.out.println("唤醒toString方法2：");//唤醒无参方法
		Method method2=c1.getMethod("toString");
		method2.invoke(obj);
		System.out.println("obj.toString() :" + obj.toString());
		
		System.out.println("唤醒toString方法1：");//唤醒有参方法
		Method method1=c1.getMethod("toString",String.class,int.class);
		method1.invoke(obj,"wangcai",12);
		System.out.println("obj.toString() :" + obj.toString());
		
		
		System.out.println("通过反射唤醒或执行被反射对象的方法：");
		Method method=c1.getMethod("printPersonSelf");
		System.out.println("唤醒printPersonSelf：");
		method.invoke(obj);
	}
}
/*@Getter
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
	public String toString(){
		return "[" + this.name + "  " + this.age + "]";	
	}
	public void printPersonSelf() {
		System.out.println("我是Person中的-printPersonSelf："+this.toString());
	}
}*/