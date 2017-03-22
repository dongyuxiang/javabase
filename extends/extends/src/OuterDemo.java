
public class OuterDemo {

	public static void main(String[] args) {
		//Outer out=new Outer();
		//out.method();
		//直接访问外部类中的内部类内容；
		//Outer.Inner in=new Outer().new Inner();
		//in.show();
		//如果内部类是静态类，就相当于一个外部类
		Outer.Inner in=new Outer.Inner();
		in.show();
	}

}
class Outer{
	private static int num=3;
	 static class  Inner{
		static void show(){
			System.out.println("show....."+num);
		}
	}
	public void method(){
		Inner in=new Inner();
		in.show();
	}
}