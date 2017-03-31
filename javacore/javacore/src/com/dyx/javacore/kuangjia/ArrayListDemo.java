package com.dyx.javacore.kuangjia;

import java.util.ArrayList;
import java.util.Iterator;

import javax.management.relation.RoleList;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList();
		list.add("学");
		list.add("习");
		list.add("java");
		list.add("很");
		list.add("快");
		list.add("乐"); 
		//for ecach输出
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("使用add添加两个元素在指定的位置…………");
		list.add(0,"我");
		list.add(1,"感觉");
		for(String string : list){
			System.out.println(string);
		}
		System.out.println("使用迭代器输出………………");
		Iterator<String> iterator =list.iterator();
		while(iterator.hasNext()){
			String string=(String) iterator.next();
			System.out.println(string);
		}
		//获取元素
		System.out.println("list.get(0)+list.get(1)"+list.get(0)+"\t"+list.get(1));

		
		list.remove(0);
		System.out.println("使用迭代器输出");
		Iterator<String> iterator2 =list.iterator();
		while(iterator2.hasNext()){
			String string =(String) iterator2.next();
			System.out.println(string);
		}
		//测试包含的元素
		System.out.println("list是否包含学;"+list.contains("学"));
		//测试非空
		System.out.println("list 是空吗："+list.isEmpty());
		//获取list容量
		System.out.println("size的元素长度："+list.size());	
	}
}
