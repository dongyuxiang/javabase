package object;

public class StringDemo1 {
	//������ַ�����ĳ���ַ������ֵĴ������ֵ�
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String str="nfdkjdbbfdlbgbkdsjdabfdgkjbf";
		String key="b";
		int count= getKeyStringCount2(str,key);
		System.out.println("count="+count);
	}

	public static int getKeyStringCount2(String str, String key) {
		// TODO �Զ����ɵķ������
		int count=0;
		int index=0;
		while((index=str.indexOf(key))!=-1){
			str=str.substring(index+key.length());
			count++;
		}
		
		return count;
	}

	private static int getKeyStringCount1(String str, String key) {
		// TODO �Զ����ɵķ������
		//1.���������
		int count=0;
		//2.���������¼key���ֵ�λ��
		int index=0;
		while((index =str.indexOf(key,index))!=-1)
			{
//			str=str.substring(index+key.length());
			index=index+key.length();
			count++;
			}
		return count;
	}



}
