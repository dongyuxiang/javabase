package com.dyx.iodemo.iofile;

import java.io.File;
import java.io.IOException;

public class IoDemo3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		File file=new File("e:\\1.txt");//定义绝对路径
		File file1=new File("E:\\abc");
//		file.createNewFile();//创建
		method3(file1);	
//		file.delete();
	}
	private static void method3(File file) throws IOException {
		// TODO Auto-generated method stub
//		boolean b=file.createNewFile();//如果文件存在则不创建，返回false，不存在就创建，成功返回true
//		System.out.println(b);
//		删除文件
//		boolean b=file.delete();
//		System.out.println(b);
		//创建文件夹
//		boolean b=file.mkdir();
//		System.out.println(b);
		//删除文件
		boolean b=file.delete();
		System.out.println(b);
	}
}