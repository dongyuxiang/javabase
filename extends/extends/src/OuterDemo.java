
public class OuterDemo {

	public static void main(String[] args) {
		//Outer out=new Outer();
		//out.method();
		//ֱ�ӷ����ⲿ���е��ڲ������ݣ�
		//Outer.Inner in=new Outer().new Inner();
		//in.show();
		//����ڲ����Ǿ�̬�࣬���൱��һ���ⲿ��
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