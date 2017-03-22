package duixiang;

class person_2{
	private String name;
	{
		System.out.println("哇哇");//构造代码块，可以给所有对象进行初始化
	}
	person_2(){
		name="baby";
	}
	person_2(String name){
		this.name=name;
	}
	public void speak(){
		System.out.println("名字："+name);
	}
}
public class staticdemo_1 {
	public static void main (String[] args){
	person_2 p1=new person_2();
	p1.speak();
	person_2 p2=new person_2("旺财");
	p2.speak();
		new person_2();
	}
}
