package com.dyx.zhujiedemo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import javax.imageio.stream.FileCacheImageInputStream;
import javax.print.attribute.standard.Fidelity;
import javax.sql.rowset.CachedRowSet;

public class TeatDemo {

	public static void main(String[] args) throws Exception {
		Class c1=ClassDemo.class;//获取字节码对象
		ClassDemo clss=(ClassDemo)c1.newInstance();//创建一个自动访问对象的无参构造函数
		//获取默认的值
		System.out.println(clss.show());
		Field[] fi=c1.getDeclaredFields();//创建属性对象
		for(Field fis:fi){
			if(fis.isAnnotationPresent(Classno.class)){//判断有没有主注解文件
				Classno classno=fis.getAnnotation(Classno.class);//利用注解的类来获取注解文件
				System.out.println("注解的值是："+classno.value());
				fis.setAccessible(true);//创建暴力访问
				fis.set(clss, classno.value());//通过set方法将原本的内容修改为注解的内容
				System.out.println("注解后的值为："+clss.show());
			}else if(fis.isAnnotationPresent(Default1.class)){//判断有没有新增加的注解
				Default1 default1=fis.getAnnotation(Default1.class);
				System.out.println("注解的值："+default1.value());
				fis.setAccessible(true);//创建暴力访问
				System.out.println("注解的类型为："+fis.getType().getSimpleName().toString());
				switch (fis.getType().getSimpleName().toString()){
				case "Integer": fis.set(clss, Integer.valueOf(default1.value()));break;
				case "String": fis.set(clss, String.valueOf(default1.value()));break;
				case "double": fis.set(clss, Double.valueOf(default1.value()));break;
				default: break;
				}	
				System.out.println("更改注解后的值为："+clss.show());
			}
		}
	}
}
