package on.set.demo1;

import java.util.HashSet;
import java.util.Iterator;

/*
 * set:Ԫ�ز������ظ���������ġ�
 * 		set�ӿ��еķ�����collectionһ�¡�
 * 		1.HashSet:�ڲ����ݽṹ�ǹ�ϣ���ǲ�ͬ����,��֤���ݵ�Ψһ�ԡ�
 * 		2.TreeSet�� 
 * */
public class HashSetDemo1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		HashSet ss=new HashSet();
		ss.add("abc1");
		ss.add("abc2");//��ΪHashSet��֤���ݵ�Ψһ�ԣ����������"abc2"���ᱻ�ظ������
		ss.add("abc2");
		ss.add("abc2");
		ss.add("abc2");
		ss.add("abc3");
		ss.add("abc4");
		Iterator it =ss.iterator();
		while(it.hasNext()){
			System.out.println( it.next());
		}
	}

}
