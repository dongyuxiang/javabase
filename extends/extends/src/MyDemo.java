
public class MyDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		father f=new Myself();
		f.read();//当方法名相同时，函就会的覆盖，
		//m.look();这个方法时不能使用的，因为父类中并没有看电影这个功能。
		Myself m=(Myself)f;
		m.look();
	}

}
class father{
	public void read(){
		System.out.println("读故事书");
	}
	public void diaoyu(){
		System.out.println("钓鱼");
	}
}
class Myself extends father{
	public void read(){
		System.out.println("读小说书");
	}
	public void look(){
		System.out.println("看电影");
	}
}