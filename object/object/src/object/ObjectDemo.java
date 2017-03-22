package object;
class Person extends Object{
	private int age;
	Person(int age){
		this.age=age;
	}
	//һ�㶼�Ḳ�Ǵ˷��������ݶ�����������ݣ������ж϶����Ƿ�����ͬ�����ݡ�
	public boolean equals(Object obj){
		Person p =(Person)obj;
		return this.age == p.age;
	}
}
//
public class ObjectDemo {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Person p1=new Person(20);
		Person p2=new Person(20);
		System.out.println(p1.hashCode());//�����������󣬲����໥���бȽ�
		System.out.println(p1.equals(p2));//�Ƚϵ��ǵ�ַ
		
		Class clazz1=p1.getClass();
		Class clazz2=p2.getClass();
		System.out.println(clazz1==clazz2);
		System.out.println(clazz2.getName());
	}

}
