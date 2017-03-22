package duixiang;

public class car {
	 int num;
	 String color;
	 void run(){
		System.out.println(num+"     "+color);
	}
	public static void main(String[] args) {
	car c=new car();
	c.num=4;
	c.color="red";
	c.run();
	}

}
