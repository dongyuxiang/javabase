package on.kuangjia.ArrayLisatTest;

import java.util.ArrayList;
import java.util.Iterator;

import on.kuangjia.onbean.Person;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList a1=new ArrayList();
		a1.add(new Person("ldij1",20));
		a1.add(new Person("ldij2",22));
		a1.add(new Person("ldij3",24));
		a1.add(new Person("ldij4",25));
		Iterator it=a1.iterator();
		while(it.hasNext()){
//			System.out.println(((Person) it.next()).getName()+"\t"+((Person) it.next()).getAge());
		Person p=(Person) it.next();
		System.out.println(p.getName()+"\t"+p.getAge());
		}
	}

}
