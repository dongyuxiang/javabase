package com.dyx.map;

import java.lang.reflect.Constructor;

public class FanSheDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?> clazz = null;
		try {
			clazz = Class.forName("com.dyx.map.Person1");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Person1 per1 = null;
		Person1 per2 = null;
		Person1 per3 = null;
		Person1 per4 = null;
		// 取得全部的构造函数
		Constructor<?> cons[] = clazz.getConstructors();
		try {
			per1 = (Person1) cons[3].newInstance();
			per2 = (Person1) cons[2].newInstance("Rollen");
			per3 = (Person1) cons[1].newInstance(20);
			per4 = (Person1) cons[0].newInstance("Rollen", 20);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(per1);
		System.out.println(per2);
		System.out.println(per3);
		System.out.println(per4);
	}
}

