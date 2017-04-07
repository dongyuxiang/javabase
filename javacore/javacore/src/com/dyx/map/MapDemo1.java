package com.dyx.map;

import java.util.HashMap;

public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> person=new HashMap<Integer,String>();
		person.put(1, "jack");
		person.put(2, "Peter");
		person.put(3,"zhangsan");
		String name3=person.get(1);
		System.out.println("the No.3 is:"+name3);
	}

}
