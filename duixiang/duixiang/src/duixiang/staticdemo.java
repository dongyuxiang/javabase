package duixiang;

public class staticdemo {
		int num=5;
	public static void main(String[] args) {
		//person p1=new person();    //�������Ǵ����������ﴴ����p1����
		//person.name="����";		//����Ա�����Ǿ�̬ʱ������ʹ�ô˷���
		person.country="h";
		new person().show();		//�˷��������ã�ֱ�Ӷ����еķ������е���
		//System.out.println(person.country);
		new staticdemo().show();
		
	}
	public void show(){
		System.out.println(num);
	}
}
class person{
	static String name;		//��Ա������ʵ������
	static String country="cn";	//	��̬�����������
	public static void show(){
		System.out.println(name+"  "+country);
	}
}
/*
 ��̬�����ͳ�Ա����������
 1.	�����������������ڲ�ͬ
 	��Ա�������Ŷ���Ĵ��������ڣ����Ŷ���ı����ն��ͷ�
 	��̬����������ļ��ض����ڣ����������ʧ����ʧ�������������ʱ����ͻ���ʧ��
 2.���÷�ʽ��ͬ
 	��Ա����ֻ�ܱ��������
 	��̬�������Ա�������ã������Ա���������
 3.������ͬ
 	��Ա����Ҳ��Ϊʵ������
 	��̬������Ϊ�����
 4.���ݴ洢λ�ò�ͬ
 	��Ա�������ݴ洢�ڶ��ڴ�����У�����Ҳ�ж������������
 	��̬�������ݴ洢�ڷ���ȥ���������������ľ�̬���У�����Ҳ�ж���Ĺ�������
 
 ��̬ʹ�õ�ע������
 1.��̬����ֻ�ܷ��ʾ�̬��Ա���Ǿ�̬�ȿ��Է��ʾ�̬���ֿ��Է��ʷǾ�̬��
 2.��̬�����в����Զ���ʹ��this����super�ؼ���
 3.�������Ǿ�̬��
 
 
������������֮��
1.��ʽ�̶�
2.��jvm�����������ʶ��͵���

public :Ȩ�ޱ���������
static ������Ҫ����
void   ��������û�о���ķ���ֵ
main   �����ǹؼ��֣�ֻ��һ��jvmʶ��Ĺ̶�������
string[] args�������������Ĳ����б���һ���������͵Ĳ���������Ԫ�ض����ַ�������
  
  
��̬�����
������ļ��ض�ִ�У�����ִֻ��һ��
����       ���ڸ�����г�ʼ����
    ��
class staticdemo_2{
	static{
		System.out.println("haha");
	}
	void show(){
		System.out.println("hehe");
	}
}
public class staticdemo_1 {
	public static void main (String[] args){
		new staticdemo_2().show();
	}
}
���Ϊ   haha
	 hehe
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
*/
