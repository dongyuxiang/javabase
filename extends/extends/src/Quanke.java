
public class Quanke {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Dog d=new Dog();
		d.houjiao();
	}

}
abstract class QuankeDemo{
      abstract void houjiao();
	
}
class Dog extends QuankeDemo{
	void houjiao(){
		System.out.println("汪汪");
	}
}
class Wolf extends QuankeDemo{
	void houjiao(){
		System.out.println("嗷嗷");
	}
}