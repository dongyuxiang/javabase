package com.dyx.javacore1.io;

import java.io.File;
import java.nio.channels.AsynchronousChannel;
import java.util.Date;
import java.util.Scanner;

import com.dyx.javacore.yunsuanfu.add6;

public class IoDemo {

	public static void main(String[] args) {
	File f1= new File("a.jpg");
	File f2=new File("D:/temp");
	System.out.println("Name"+f1.getName());
	System.out.println("Path:"+f1.getPath());
	System.out.println("AbsoultePath:"+f1.getAbsolutePath());//获取绝对路径
	System.out.println("Parent:"+f1.getParent());
	System.out.println("lastModified"+new Date(f1.lastModified()));//最后一次修改文件的时间
	System.out.println("length"+f1.length());
	System.out.println("exists:"+f1.exists());
	System.out.println("canRead"+f1.canRead());
	System.out.println("canWrite:"+f1.canWrite());
	System.out.println("isFile:"+f1.isFile());
	System.out.println("isHidden"+f1.isHidden());//文件是否是隐藏类型
	System.out.println("isDirectory:"+f1.isDirectory());
	System.out.println("isAbsolute:"+f1.isAbsolute());
	System.out.println("length:"+f1.length());
//	f1.delete();
//	f2.mkdirs(temp);
//	add
	}

}
