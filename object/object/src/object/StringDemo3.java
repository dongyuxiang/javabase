package object;

public class StringDemo3 {
	//出去字符串首尾的空格
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s="      ab    c    ";
		 s=Mytrim(s);
		 System.out.println(s);
	}

	public static String Mytrim(String s) {
		// TODO 自动生成的方法存根
		int start=0;int end=s.length()-1;
		while(start<=end && s.charAt(start) ==' '){
			start++;
			}
		while(start<=end && s.charAt(end)==' '){
			end--;
		}
		return s.substring(start,end+1);
	}

}
