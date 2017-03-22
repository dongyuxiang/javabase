public class Person{
	public static void main(String[] args){
		//Student s = new Student();
		//s.name="张三";
		//s.age=20;
		//s.study();
		Zi z=new Zi();
		z.show();
	}
}
/**
 定义Person类中的相关成员
 @param  name 指的是人的名字，age指的是人的年龄
 */
class Person1{
	String name;
	int age;
}
class Student extends Person1{
	void study(){
		System.out.println("我叫"+super.name+"   我是学生，我要学习     "+"我今年"+super.age);
	}
}
class  Fu{
	Fu(){
		show();//由于子类中 有show方法，座椅父类中的show方法被子类中的show方法覆盖。
	}
	void show(){
		System.out.println("Fu run");
	}
}
class  Zi  extends Fu{
	int num=8;
	 Zi(){
		 super();//通过super初始化父类内容时，子类的成员变量并未显示初始化。等super（）父类初始化完毕后，
		         //才进行子类的的成员变量初始化。
		 return;
	}
	 void show(){
		 System.out.println("Zi run "+num);
	 }
}