
public class AnimalDemo {

	public static void main(String[] args) {
		//Cat c=new Cat();
		//Dog1 d=new Dog1();
		//method(new Cat());
		//method(new Dog1());
		Animal a=new Cat();//自动提升，狗对象提升为动物类型。但是狗的台湾游功能无法访问
		a.eat();			//作用:限制对本身特有功能的访问
							//专业讲就是向上转型
		Cat c=(Cat)a;;
		c.eat();
	}
	public static  void method(Animal a){//接口类型的引用，用于接收（指向）接口的子类对象。
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
abstract class Animal{//暴露规则
	abstract void eat();
	abstract void hunt();
}
class Dog1 extends Animal{
	public void eat(){
		System.out.println("我爱吃骨头");
	}
	public void hunt(){
		System.out.println("抓小偷");
	}
	public void kanjia(){
		System.out.println("我的职责是看家");
	}
}
class Cat extends Animal{
	public void eat(){
		System.out.println("我爱吃鱼");
	}
	public void hunt(){
		System.out.println("抓老鼠");
	}
	public void catchMouse(){
		System.out.println("捉老鼠");
	}
}