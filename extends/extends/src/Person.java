public class Person{
	public static void main(String[] args){
		//Student s = new Student();
		//s.name="����";
		//s.age=20;
		//s.study();
		Zi z=new Zi();
		z.show();
	}
}
/**
 ����Person���е���س�Ա
 @param  name ָ�����˵����֣�ageָ�����˵�����
 */
class Person1{
	String name;
	int age;
}
class Student extends Person1{
	void study(){
		System.out.println("�ҽ�"+super.name+"   ����ѧ������Ҫѧϰ     "+"�ҽ���"+super.age);
	}
}
class  Fu{
	Fu(){
		show();//���������� ��show���������θ����е�show�����������е�show�������ǡ�
	}
	void show(){
		System.out.println("Fu run");
	}
}
class  Zi  extends Fu{
	int num=8;
	 Zi(){
		 super();//ͨ��super��ʼ����������ʱ������ĳ�Ա������δ��ʾ��ʼ������super���������ʼ����Ϻ�
		         //�Ž�������ĵĳ�Ա������ʼ����
		 return;
	}
	 void show(){
		 System.out.println("Zi run "+num);
	 }
}