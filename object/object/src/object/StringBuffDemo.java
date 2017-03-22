package object;

public class StringBuffDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		BuffMethodDemo();
	}

	public static void BuffMethodDemo() {
		// TODO 自动生成的方法存根
		StringBuffer s= new StringBuffer("abcd");
//		StringBuffer s1=s.append(4);
// 		s.append(4).append("dakfdkj");
//		s.insert(3, "dong");
		s.replace(1, 3, "dong");
		System.out.println(s.toString());
	}

}
