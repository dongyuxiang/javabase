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
		/*ArrayList<String> list =new ArrayList<String>();
		ArrayList<String> l =new ArrayList<String>();
		l.add("习");
		l.add("学");
		
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
		//测试包含的元素      自定义的类型时，要重写这个方法
		System.out.println("list是否包含学;"+list.contains("学"));
		//测试非空
		System.out.println("list 是空吗："+list.isEmpty());
		//获取list容量
		System.out.println("size的元素长度："+list.size());	
		list.remove("乐");
		System.out.println("list.remove :"+list);
		//查找元素的索引
		System.out.println("list.indexOf :"+list.indexOf("快"));
		//
		list.set(3,"c语言");
		System.out.println(list);
		//截取指定长度的元素
		System.out.println("list.sublist:"+list.subList(0, 3));//包含头不包含尾
		
		List<String> list2=list.subList(0,3);//修改list2会影响list
		System.out.println("list.contains(list2) :"+list.contains(list2));
		
		//list2添加元素
		list2.add("linux");
		System.out.println(list2);
		System.out.println(list);
		System.out.println("list.containsAll(list2) :"+list.containsAll(list2));
		//删除自己的所有元素
		//list.removeAll(list);
		//list.clear();//清除所有元素
		list.retainAll(l);//保留与l中相同的元素，其它元素全部删除
		System.out.println("list.size() : "+list.size());
		System.out.println(list);*/
	} 
}
