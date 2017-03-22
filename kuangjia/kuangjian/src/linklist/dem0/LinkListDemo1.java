package linklist.dem0;

import java.util.Iterator;
import java.util.LinkedList;

import link.list.text.DuiLie;

public class LinkListDemo1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		DuiLie d1 =new DuiLie();
		d1.myAdd("abc1");
		d1.myAdd("abc2");
		d1.myAdd("abc3");
		d1.myAdd("abc4");
		while(!d1.isNull()){
			System.out.println(d1.myGet());
		}
//		LinkedList link=new LinkedList();
//		link.addFirst("abc1");
//		link.addFirst("abc2");
//		link.addFirst("abc3");
//		link.addFirst("abc4");
////		System.out.println(link.getFirst());
////		System.out.println(link.getFirst());
////		Iterator it=link.iterator();
////		while(it.hasNext()){
////			System.out.println(it.next());
////		}
//		while(!link.isEmpty()){
//			System.out.println(link.removeFirst());
//		}
//		System.out.println(link);
	}
	
}
