package object;
class Fu{
	void show(){
		System.out.println(" Fu show");
	}
}
class Zi extends Fu{
	void show(){
		System.out.println("Zi show");
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		Fu f=new Zi();
		f.show();
	}
}
