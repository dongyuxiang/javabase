
package list.demo;

import java.util.ArrayList;
import java.util.List;


public class ListDemo{
	public static void main(String[] args){
	List list = new ArrayList();
		show(list);
	}

	public static void show(List list) {
		// TODO �Զ����ɵķ������
		//���Ԫ��
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		System.out.println(list);
		//����Ԫ��
		//list.add(1,"abc6");
//		System.out.println("remove:"+list.remove(2));
//		System.out.println(list);
		//�޸�Ԫ��
//		System.out.println("set:"+list.set(1,"abc0"));
		//��ȡԪ��
		System.out.println("get:"+list.get(1));
		System.out.println(list);
	}
}
	