package on.set.demo1;

import java.util.HashSet;
import java.util.Iterator;

/*
 * set:元素不可以重复，是无序的。
 * 		set接口中的方法和collection一致。
 * 		1.HashSet:内部数据结构是哈希表，是不同步的,保证数据的唯一性。
 * 		2.TreeSet： 
 * */
public class HashSetDemo1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		HashSet ss=new HashSet();
		ss.add("abc1");
		ss.add("abc2");//因为HashSet保证数据的唯一性，所以下面的"abc2"不会被重复输出。
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
