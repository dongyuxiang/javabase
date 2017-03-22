
public class OuterDemo1 {

	public static void main(String[] args) {
		
		new Outer2().method();
	}

}
/*class Outer1{
	int num=3;
	void method(){
		final int x=4;
	class Inner{
		
		 void show(){
			int num=5;
			System.out.println("你猜我是几"+x);
		}
	}
	new Inner().show();
	}
}*/
abstract class  Demo{
	abstract void show();
}
class Outer2{
	int num=4;
	/*class Inner extends Dmeo{
		void show(){
			System.out.println("show run"+num);
		}
	}*/
	public void method(){
		new Demo(){  //匿名内部类
			void show(){
				System.out.println("show run"+num);
			}
		}.show();
	}
	
}