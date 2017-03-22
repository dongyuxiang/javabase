package duixiang;

public class staticdemo {
		int num=5;
	public static void main(String[] args) {
		//person p1=new person();    //此语句就是创建对象，这里创建了p1对象
		//person.name="张三";		//当成员变量是静态时，才能使用此方法
		person.country="h";
		new person().show();		//此方法的作用，直接对类中的方法进行调用
		//System.out.println(person.country);
		new staticdemo().show();
		
	}
	public void show(){
		System.out.println(num);
	}
}
class person{
	static String name;		//成员变量，实例变量
	static String country="cn";	//	静态变量，类变量
	public static void show(){
		System.out.println(name+"  "+country);
	}
}
/*
 静态变量和成员变量的区别
 1.	两个变量的生命周期不同
 	成员变量随着对象的创建而存在，随着对象的被回收而释放
 	静态变量随着类的加载而存在，随着类的消失而消失（当虚拟机结束时，类就会消失）
 2.调用方式不同
 	成员变量只能被对象调用
 	静态变量可以被对象调用，还可以被类名调用
 3.别名不同
 	成员变量也称为实例变量
 	静态变量称为类变量
 4.数据存储位置不同
 	成员变量数据存储在堆内存对象中，所以也叫对象的特有数据
 	静态变量数据存储在方法去（共享数据区）的静态区中，所以也叫对象的共享数据
 
 静态使用的注意事项
 1.静态方法只能访问静态成员（非静态既可以访问静态，又可以访问非静态）
 2.静态方法中不可以定义使用this或者super关键字
 3.主函数是静态的
 
 
主函数的特殊之处
1.格式固定
2.被jvm（虚拟机）所识别和调用

public :权限必须是最大的
static ：不需要对象
void   ：主函数没有具体的返回值
main   ：不是关键字，只是一个jvm识别的固定的名字
string[] args：这是主函数的参数列表，是一个数组类型的参数，而且元素都是字符串类型
  
  
静态代码块
随着类的加载而执行，而且只执行一次
作用       用于给类进行初始化。
    例
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
结果为   haha
	 hehe
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
*/
