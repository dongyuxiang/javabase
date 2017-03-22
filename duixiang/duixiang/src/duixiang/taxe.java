package duixiang;
class care{
	int num;
	String color;
	void run(){
		System.out.println(num+"    "+color);
	}
}

public class taxe {
	public static void main(String[] args) {
			care c1=new care();
			show(c1);
			care c2=new care();
			show(c2);
	}
	public static void show(care c){
		c.num=4;
		c.color="red";
		System.out.println(c.num+"   "+c.color);
	}
}
