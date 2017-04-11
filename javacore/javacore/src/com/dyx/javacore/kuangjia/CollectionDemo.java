package com.dyx.javacore.kuangjia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection coll=new ArrayList();
		Collection c1=new ArrayList();
		Collection c2=new ArrayList();
		show(coll);
		show(c1,c2);
	}
	public static void show(Collection c1,Collection c2){
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");
		
		c2.add("abc2");
		c2.add("abc5");
		c2.add("abc6");
		System.out.println("c1"+c1);
		System.out.println("c2"+c2);
		
//		c1.addAll(c2);//将c2中的元素添加到c1中
		c1.removeAll(c2);//删除两个集合中相同的元素
		System.out.println("c1:"+c1);
	}
	public static void show(Collection coll){
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");
		System.out.println(coll);
		//删除元素
		coll.remove("abc2");//可以改变集合的长度
//		Iterator<String> iterator=coll.iterator();
//		while(iterator.hasNext()){
//			System.out.print(iterator.next()+",");
//		}
		for(Iterator iterator=coll.iterator();iterator.hasNext();){
			System.out.println(iterator.next()+",");
		}
		System.out.println();
	}

}
