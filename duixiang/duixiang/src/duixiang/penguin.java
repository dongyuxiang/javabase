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
		System.out.println("��������"+name+"���Ľ���ֵ"+health+"�����Ա�"+sex);
	}
	public static void main(String[] args) {
		penguin pen=new penguin();
		pen.penguin("���",10,"����");

	}

}
