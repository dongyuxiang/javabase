
public class EmployeeDemo {
/*
 ��Աʵ��
 Ҫ�󣺹�˾�г���Ա�����������ţ�нˮ����������
 ��Ŀ������������������ţ�нˮ�����н��𣬹������ݡ�
 �Ը�������������ݽ�ģ
 
 ������
 ��������� �����У����ҳ��漰�Ķ���
 ͨ��������������
 ����Ա��
  	���ԣ����������ţ�нˮ��
 	��Ϊ������
 ����
 	���ԣ����������ţ�нˮ������
 	��Ϊ������
����Ա�;���������ֱ�Ӽ̳й�ϵ
���ǳ���Ա�;���ȴ���й������ݡ�
���Խ��г�ȡ����Ϊ���Ƕ��ǹ�˾�Ĺ�Ա
���Խ�����Ա�;�����г�ȡ��������ϵ
 */
	public static void main(String[] args) {
		Programmer p=new Programmer("����",1234654,3000);
		
		p.worker();

	}

}
abstract class Employee{
	private String name;
	private int number;
	private double salary;
	Employee(String name,int num,double salary){
		this.name=name;
		this.number=number;
		this.salary=salary;
	}
	public abstract void worker();
	
}
class Programmer extends Employee{
	Programmer(String name,int number,double salary){
		super(name,number,salary);
	}
	public void worker(){
		System.out.println("�ҵĹ������ô���");
	}
}
class Manager extends Employee{
	private int bonus;
	Manager(String name,int number,double salary,int bonus){
		super(name,number,salary);
		this.bonus=bonus;
	}
	public void worker(){
		System.out.println("�ҵĹ����ǹ�������Ա��");
	}
}
 