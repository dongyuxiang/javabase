package com.dyx.iodemo.iofile;

import java.io.File;

public class IoFileDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*File类，常见方法
		 * 
		 * 1.名字，获取名称
		 * Stirng();
		 * 2.大小，获取大小
		 * long len=file.length;  因为文件的类型很大时，int型也满足不了文件的大小
		 * 3.获取类型
		 * 类型时不确定的
		 * 4.获取所在目录
		 * file.getfileAbsolutePath()//返回绝对路径
		 * file.getpath//获取的是封装路径
		 * */
		File file =new File("e：\\1.txt");
		String file_name = file.getName();
		System.out.println(file_name);
		long len=file.length();
		System.out.println("问价长度"+len);
		String s1=file.getAbsolutePath();
		System.out.println(s1);
	}
}
