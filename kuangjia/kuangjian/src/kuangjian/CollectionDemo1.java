package kuangjian;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			Collection coll=new ArrayList();
			coll.add("abc1");
			coll.add("abc2");
			coll.add("abc3");
			coll.add("abc4");
//		Iterator it=coll.iterator();
			for(Iterator it = coll.iterator();it.hasNext();)
					System.out.println(it.next());
	}

}
