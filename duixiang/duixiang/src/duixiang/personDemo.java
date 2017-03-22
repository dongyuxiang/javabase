package duixiang;

public class personDemo {

	public static void main(String[] args) {
		Person_1 p=new Person_1();
		p.speak();
	}

	public void setage(int i) {
		
	}
}
class Person_1{
	private String name;
	private int age;
	Person_1(){
		System.out.println("我被执行了");
	}
	public void speak(){
		System.out.println(name+"  "+age);
	}
}