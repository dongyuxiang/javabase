package link.list.text;

import java.util.LinkedList;

public class DuiLie {
	private LinkedList link;
	public DuiLie(){
		link = new LinkedList();
	}
	//添加元素
	public void myAdd(Object obj){
		link.addLast(obj);
	}
	//获取元素
	public Object myGet(){
		return link.removeFirst();
	}
	public boolean isNull(){
		return link.isEmpty();
	}
}
