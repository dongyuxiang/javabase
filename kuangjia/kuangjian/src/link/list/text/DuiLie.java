package link.list.text;

import java.util.LinkedList;

public class DuiLie {
	private LinkedList link;
	public DuiLie(){
		link = new LinkedList();
	}
	//���Ԫ��
	public void myAdd(Object obj){
		link.addLast(obj);
	}
	//��ȡԪ��
	public Object myGet(){
		return link.removeFirst();
	}
	public boolean isNull(){
		return link.isEmpty();
	}
}
