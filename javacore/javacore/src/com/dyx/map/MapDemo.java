package com.dyx.map;

import java.nio.channels.ScatteringByteChannel;
import java.util.HashMap;

public class MapDemo {
	@SuppressWarnings("unchecked")
		public static void main(String[] args){
		HashMap person =new HashMap();
		person.put(1, "jack");
		person.put(2, "peter");
		person.put(3, "Alice");
		String name3=(String)person.get(1);
		System.out.println("the No.3 is: "+name3);
	}
}
