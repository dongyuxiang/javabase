package duixiang;

public class penguin {
	private String name =null;
	private int health=0;
	private String sex=null;
	public void penguin(String name,int health,String sex){
		this.name=name;
		this.health=health;
		this.sex=sex;
		System.out.println(name+"  "+health+"  "+sex);
	}
	public void print(){
		System.out.println("企鹅的名字"+name+"企鹅的健康值"+health+"企鹅的性别"+sex);
	}
	public static void main(String[] args) {
		penguin pen=new penguin();
		pen.penguin("企鹅",10,"雄性");

	}

}
