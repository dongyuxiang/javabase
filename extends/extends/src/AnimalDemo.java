
public class AnimalDemo {

	public static void main(String[] args) {
		//Cat c=new Cat();
		//Dog1 d=new Dog1();
		//method(new Cat());
		//method(new Dog1());
		Animal a=new Cat();//�Զ�����������������Ϊ�������͡����ǹ���̨���ι����޷�����
		a.eat();			//����:���ƶԱ������й��ܵķ���
							//רҵ����������ת��
		Cat c=(Cat)a;;
		c.eat();
	}
	public static  void method(Animal a){//�ӿ����͵����ã����ڽ��գ�ָ�򣩽ӿڵ��������
		if(a instanceof Cat){
			Cat c=(Cat)a;
			c.catchMouse();
		}
		else if(a instanceof Dog1){
			Dog1 d=(Dog1)a;
			a.hunt();
		}
	}
}
abstract class Animal{//��¶����
	abstract void eat();
	abstract void hunt();
}
class Dog1 extends Animal{
	public void eat(){
		System.out.println("�Ұ��Թ�ͷ");
	}
	public void hunt(){
		System.out.println("ץС͵");
	}
	public void kanjia(){
		System.out.println("�ҵ�ְ���ǿ���");
	}
}
class Cat extends Animal{
	public void eat(){
		System.out.println("�Ұ�����");
	}
	public void hunt(){
		System.out.println("ץ����");
	}
	public void catchMouse(){
		System.out.println("׽����");
	}
}