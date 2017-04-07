package com.dyx.javacore.kuangjia;

import java.util.LinkedList;

import org.omg.CosNaming.IstringHelper;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		System.out.println(list);
		list.addFirst(10);
		System.out.println("addFirst  : "+list);
		list.addLast(66);
		System.out.println("addlast : "+list);
		//获取首元素但不删除首元素
		System.out.println("list.getFirst : "+list.getFirst());
		System.out.println("list.getLast : "+list.getLast());
		System.out.println(list);
		//返回不删除头元素
		System.out.println("list.peek : "+list.peek());
		System.out.println(list);
		//返回首元素并删除
		System.out.println("list.poll ： "+list.poll());
		System.out.println(list);
		//将元素添加到尾部
		System.out.println("list.offer ： "+list.offer(13));
		System.out.println(list);
		//将元素添加在首部
		System.out.println("list.offerFirst: "+list.offerFirst(8));
		System.out.println(list);
		//返回收个元素但不删除
		System.out.println("list.element() :"+list.element());
		System.out.println(list);
		//判断集合中是否有指定元素存在
		System.out.println("list.contains(66) : "+list.contains(66));
		System.out.println("list.contains(14) : "+list.contains(14));
		System.out.println(list);
		list.set(2, 101);
		System.out.println("list.set(): "+list);
	}

}
