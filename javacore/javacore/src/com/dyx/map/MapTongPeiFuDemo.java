package com.dyx.map;

import java.util.ArrayList;

public class MapTongPeiFuDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 =new ArrayList<String>();
		list1.add("abcd");
		list1.add("efgh");
		System.out.println(list1);
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(2345);
		list2.add(54432);
		System.out.println(list2);
	}
	public static void display(ArrayList<?> list){
		for(Object obj:list){
			System.out.println(obj);
		}
	}
}
