
public class MyDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		father f=new Myself();
		f.read();//����������ͬʱ�����ͻ�ĸ��ǣ�
		//m.look();�������ʱ����ʹ�õģ���Ϊ�����в�û�п���Ӱ������ܡ�
		Myself m=(Myself)f;
		m.look();
	}

}
class father{
	public void read(){
		System.out.println("��������");
	}
	public void diaoyu(){
		System.out.println("����");
	}
}
class Myself extends father{
	public void read(){
		System.out.println("��С˵��");
	}
	public void look(){
		System.out.println("����Ӱ");
	}
}