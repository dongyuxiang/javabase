
public class EmployeeDemo {
/*
 雇员实例
 要求：公司中程序员有姓名，工号，薪水，工作内容
 项目经理除了有姓名，工号，薪水，还有奖金，工作内容。
 对给出需求进行数据建模
 
 分析：
 在这个问题 领域中，先找出涉及的对象。
 通过名词提炼法。
 程序员：
  	属性：姓名，工号，薪水。
 	行为：工作
 经理：
 	属性：姓名，工号，薪水，奖金。
 	行为：工作
程序员和经理不存在着直接继承关系
但是程序员和经理却具有共性内容。
可以进行抽取，因为他们都是公司的雇员
可以将程序员和经理进行抽取，建立体系
 */
	public static void main(String[] args) {
		Programmer p=new Programmer("张三",1234654,3000);
		
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
		System.out.println("我的工作是敲代码");
	}
}
class Manager extends Employee{
	private int bonus;
	Manager(String name,int number,double salary,int bonus){
		super(name,number,salary);
		this.bonus=bonus;
	}
	public void worker(){
		System.out.println("我的工作是管理其他员工");
	}
}
 