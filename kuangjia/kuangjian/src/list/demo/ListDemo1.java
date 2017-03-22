package list.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List list=new ArrayList();
		show(list);

	}

	public static void show(List list) {
		// TODO 自动生成的方法存根
		list.add("abc1");
		list.add("abc2");
		list.add("abC3");
		list.add("abc4");
		System.out.println(list);
		ListIterator it = list.listIterator();
		while(it.hasNext()){
			Object obj = it.next();
			if(obj.equals("abc2")){
				it.add("abc9");
			}
		}
		System.out.println("next:"+it.hasNext());
		System.out.println("previous"+it.hasPrevious());
		while(it.hasPrevious()){
			System.out.println(it.previous());
		}
		System.out.println("list:"+list);
		/*Iterator it = list.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			if(obj.equals("abc2")){
				list.add("abc9");
			}
			else
				System.out.println(obj);
		}
		System.out.println(list);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	for(int x=0;x<list.size();x++){
			System.out.println("get:"+list.get(x));
		}*/
	}
}
