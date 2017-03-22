package arrays;

public class SingleDemo {

	public static void main(String[] args) {
	//Single ss= Single.getInstance();   //ssΪgetInstance���ڴ��еĵ�ַ
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
//��ģʽ
class Single{
	private static Single s= new Single();//��һ���ض�����Ѿ������ˡ�
	private Single(){}
	public static Single getInstance(){
		return s;
	}
}
//����ģʽ
class Single1{
	private static Single1 s=null;//����ؽ�����û�ж���ֻ�е���getInstance����ʱ���Żᴴ������ ��
	private Single1(){}				//�ӳټ���
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