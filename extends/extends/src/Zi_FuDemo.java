
public class Zi_FuDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Fu1 f=new Zi1();
		f.show();
	}

}
class Fu1{
	void show(){
		System.out.println("Fu run");
	}
}
class Zi1 extends Fu1{
	void show(){
		System.out.println("Zi run");
	}
}