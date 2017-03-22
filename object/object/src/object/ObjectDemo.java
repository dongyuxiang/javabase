package object;
class Person extends Object{
	private int age;
	Person(int age){
		this.age=age;
	}
	//一般都会覆盖此方法，根据对象的特有内容，建立判断对象是否先相同的依据。
	public boolean equals(Object obj){
		Person p =(Person)obj;
		return this.age == p.age;
	}
}
//
public class ObjectDemo {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Person p1=new Person(20);
		Person p2=new Person(20);
		System.out.println(p1.hashCode());//这是两个对象，不能相互进行比较
		System.out.println(p1.equals(p2));//比较的是地址
		
		Class clazz1=p1.getClass();
		Class clazz2=p2.getClass();
		System.out.println(clazz1==clazz2);
		System.out.println(clazz2.getName());
	}

}
