package arrays;

public class SingleDemo {

	public static void main(String[] args) {
	//Single ss= Single.getInstance();   //ss为getInstance在内存中的地址
	//System.out.println(ss);
	//Test T1=new Test();
	//Test T2=new Test();
	Test T1=Test.getInstance();
	Test T2=Test.getInstance();
	T1.setNum(10);
	T2.setNum(20);
	System.out.println(T1.getNum());
	System.out.println(T2.getNum());
	}

}
//恶汉模式
class Single{
	private static Single s= new Single();//类一加载对象就已经存在了。
	private Single(){}
	public static Single getInstance(){
		return s;
	}
}
//懒汉模式
class Single1{
	private static Single1 s=null;//类加载进来，没有对象。只有调用getInstance方法时，才会创建对象 。
	private Single1(){}				//延迟加载
	private static Single1 getInstance(){
		if(s==null)
			s = new Single1();
		return s;
	}
	
}
class Test{
	private int num;
	private static Test T1= new Test();
	private Test(){}
	public static Test getInstance(){
		return T1;
	}
	public void setNum(int num ){
		this.num=num;
		}
	public int getNum(){
		return num;
	}
}