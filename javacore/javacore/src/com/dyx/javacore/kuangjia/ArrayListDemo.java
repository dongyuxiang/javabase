package com.dyx.javacore.kuangjia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.management.relation.RoleList;
import javax.swing.event.ListSelectionEvent;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Student>list=new ArrayList<Student>();
		list.add(new Student("ID1001",11));
		list.add(new Student("ID1002",12));
		list.add(new Student("ID1003",13));
		list.add(new Student("ID1004",14));
		list.add(new Student("ID1005",15));
		list.add(new Student("ID1006",16));
		System.out.println(list);
		ArrayList<String> list1 =new ArrayList<String>();
		ArrayList<String> l =new ArrayList<String>();
		l.add("习");
		l.add("学");
		
		list1.add("学");
		list1.add("习");
		list1.add("java");
		list1.add("很");
		list1.add("快");
		list1.add("乐"); 
		//for ecach输出
		for (String string : list1) {
			System.out.println(string);
		}
		System.out.println("使用add添加两个元素在指定的位置…………");
		list1.add(0,"我");
		list1.add(1,"感觉");
		for(String string : list1){
			System.out.println(string);
		}
		System.out.println("使用迭代器输出………………");
		Iterator<String> iterator =list1.iterator();
		while(iterator.hasNext()){
			String string=(String) iterator.next();
			System.out.println(string);
		}
		//获取元素
		System.out.println("list.get(0)+list.get(1)"+list1.get(0)+"\t"+list1.get(1));

		
		list1.remove(2);
		System.out.println("使用迭代器输出");
		Iterator<String> iterator2 =list1.iterator();
		while(iterator2.hasNext()){
			String string =(String) iterator2.next();
			System.out.println(string);
		}
		//测试包含的元素      自定义的类型时，要重写这个方法
		System.out.println("list是否包含学;"+list1.contains("学"));
		//测试非空
		System.out.println("list 是空吗："+list1.isEmpty());
		//获取list容量
		System.out.println("size的元素长度："+list1.size());	
		list1.remove("乐");
		System.out.println("list.remove :"+list1);
		//查找元素的索引
		System.out.println("list.indexOf :"+list1.indexOf("快"));
		//
		list1.set(3,"c语言");
		System.out.println(list1);
		//截取指定长度的元素
		System.out.println("list.sublist:"+list1.subList(0, 3));//包含头不包含尾
		
		List<String> list2=list1.subList(0,3);//修改list2会影响list
		System.out.println("list.contains(list2) :"+list1.contains(list2));
		
		//list2添加元素
		list2.add("linux");
		System.out.println(list2);
		System.out.println(list1);
		System.out.println("list.containsAll(list2) :"+list1.containsAll(list2));
		//删除自己的所有元素
		//list.removeAll(list);
		//list.clear();//清除所有元素
		list1.retainAll(l);//保留与l中相同的元素，其它元素全部删除
		System.out.println("list.size() : "+list1.size());
		System.out.println(list1);
	} 
}
