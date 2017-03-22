package vectordemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VerctorDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Vector v = new Vector();
		v.addElement("abc1");
		v.addElement("abc2");
		v.addElement("abc3");
		v.addElement("abc4");
		v.addElement("abc5");
//		System.out.println(v);
		
		Enumeration en= v.elements();
		while(en.hasMoreElements()){
			System.out.println("nextelement:"+en.nextElement());
		}
			Iterator it = v.iterator();

			while (it.hasNext()){
				System.out.println("next:"+it.next());
			
				
		}
	}

}
