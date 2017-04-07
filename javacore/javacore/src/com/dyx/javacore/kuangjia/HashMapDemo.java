package com.dyx.javacore.kuangjia;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Long, Student> hashMap = new HashMap<Long, Student>();
		// 添加元素
		hashMap.put(11L, new Student("ID001", 25));
		hashMap.put(12L, new Student("ID002", 20));
		hashMap.put(13L, new Student("ID003", 24));
		hashMap.put(14L, new Student("ID004", 30));
		hashMap.put(15L, new Student("ID005", 45));
		System.out.println("hashMap :" + hashMap);
		
		//获取指定元素
	}
}
