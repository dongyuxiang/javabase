package object;

public class StringDemo3 {
	//��ȥ�ַ�����β�Ŀո�
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String s="      ab    c    ";
		 s=Mytrim(s);
		 System.out.println(s);
	}

	public static String Mytrim(String s) {
		// TODO �Զ����ɵķ������
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
