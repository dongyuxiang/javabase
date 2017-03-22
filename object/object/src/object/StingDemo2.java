package object;

public class StingDemo2 {
	//两个字符串中最大相同的子串
	/**
	 * 思路
	 * 1.先看短的字符串是否在长的那个字符串中，如果存在，短的那个字符串就是最大子串
	 * 2.如果不是，那么久讲短的那个子串进行长度递减的方式取子串，然后去长字符串中比较是否存在
	 * 3.如果有就已经找到，就不用找了
	 * 
	 * */
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s1="adsabcdrgfd";
		String s2="dsdfghabcd";
		String s=getMaxSubstring(s1,s2);
		System.out.println(s);
	}
	/**
	 * 获取最大的子串
	 * @param s1
	 * @param s2
	 * return
	 * */

	public static String getMaxSubstring(String s1, String s2) {
		// TODO 自动生成的方法存根
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
