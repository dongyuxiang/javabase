package com.dyx.iodemo.iofile;

import java.io.File;

public class IoFileDemo {

	public static void main(String[] args) {
		// 将一个具体的路径封装成了file对象。可以封装在的文件或目录，也可以封装不存在文件或目录
		File file =new File("e:\\1.txt");
		//File(String parent,String child)
		File file1=new File("e:\\1.txt");//e:\\是字符串参数
//		File file1=new File("e:"+File.separator+"1.txt");//File.sepatator是自动适应任何系统的目录分割符号
		//File(File parent,File child)
		File dir=new File("e:\\");//dir是文件对象参数
		File file2=new File(dir,"1.txt");//dir是文件对象参数、
		
	}
}
