package object;

public class StringDemo1 {
	//计算出字符串中某个字符串出现的次数出现的
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String str="nfdkjdbbfdlbgbkdsjdabfdgkjbf";
		String key="b";
		int count= getKeyStringCount2(str,key);
		System.out.println("count="+count);
	}

	public static int getKeyStringCount2(String str, String key) {
		// TODO 自动生成的方法存根
		int count=0;
		int index=0;
		while((index=str.indexOf(key))!=-1){
			str=str.substring(index+key.length());
			count++;
		}
		
		return count;
	}

	private static int getKeyStringCount1(String str, String key) {
		// TODO 自动生成的方法存根
		//1.定义计数器
		int count=0;
		//2.定义变量记录key出现的位置
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
