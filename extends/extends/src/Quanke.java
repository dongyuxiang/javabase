
public class Quanke {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Dog d=new Dog();
		d.houjiao();
	}

}
abstract class QuankeDemo{
      abstract void houjiao();
	
}
class Dog extends QuankeDemo{
	void houjiao(){
		System.out.println("����");
	}
}
class Wolf extends QuankeDemo{
	void houjiao(){
		System.out.println("��");
	}
}