package object;

public class StingDemo2 {
	//�����ַ����������ͬ���Ӵ�
	/**
	 * ˼·
	 * 1.�ȿ��̵��ַ����Ƿ��ڳ����Ǹ��ַ����У�������ڣ��̵��Ǹ��ַ�����������Ӵ�
	 * 2.������ǣ���ô�ý��̵��Ǹ��Ӵ����г��ȵݼ��ķ�ʽȡ�Ӵ���Ȼ��ȥ���ַ����бȽ��Ƿ����
	 * 3.����о��Ѿ��ҵ����Ͳ�������
	 * 
	 * */
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String s1="adsabcdrgfd";
		String s2="dsdfghabcd";
		String s=getMaxSubstring(s1,s2);
		System.out.println(s);
	}
	/**
	 * ��ȡ�����Ӵ�
	 * @param s1
	 * @param s2
	 * return
	 * */

	public static String getMaxSubstring(String s1, String s2) {
		// TODO �Զ����ɵķ������
		String max=null,min=null;
		max=(s1.length()>s2.length())?s2:s1;
		min=max.equals(s1)?s2:s1;
		for (int i = 0; i < s2.length(); i++) {
			for (int a = 0,b=s2.length()-i; b!=s2.length()+1; a++,b++) {
				String sub=s2.substring(a,b);
				System.out.println(sub);
				//if(s1.contains(sub))
					//return sub;
			}
			
		}
		return null;
	}

}
