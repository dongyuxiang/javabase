package com.dyx.zhujie;

import java.lang.reflect.Field;

public class AnnotationDemo {

	public static void main(String[] args) throws Exception {
		Class c1=Son.class;
		Son son=(Son)c1.newInstance();
		System.out.println("Son的默认值");
		son.show();
		Field[] fi=c1.getDeclaredFields();
		for(Field fis:fi){
			if(fis.isAnnotationPresent(SonName.class)){//判断Son中属性中有没有Default注解
				SonName annotation=fis.getAnnotation(SonName.class);
				System.out.println("SonName注解的值是:"+annotation.value());
				fis.setAccessible(true);
				 fis.set(son,annotation.value());
			}else if(fis.isAnnotationPresent(Default.class)){//判断Son中属性有没有SonName的注解
				Default annotation1=fis.getAnnotation(Default.class);
				System.out.println("Default注解的值是:"+annotation1.value());
				fis.setAccessible(true);
//				System.out.println(fis.getType().getSimpleName());
				switch (fis.getType().getSimpleName().toString()) {
				case "Integer":		fis.set(son,Integer.valueOf(annotation1.value()));   break;
				case "double":  fis.set(son, Double.valueOf(annotation1.value()));	 break;
				case "String":	fis.set(son, String.valueOf(annotation1.value()));	 break;
				default:break;
				}
			}
		}
		System.out.println("注解后的值");
		son.show();
	}

}
