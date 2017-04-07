package com.dyx.javacore1.ioshilihuan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.omg.CORBA.PRIVATE_MEMBER;

public class IoShiLiDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos= new FileOutputStream("person.object");//在绝对路径下生成person.object
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(new Person(1,"zhangsan","20"));
		oos.writeObject(new Person(2,"lisi","21"));
		System.out.println(new File("person.object").getAbsolutePath());//获取指定文件的绝对路径
		oos.close();
		System.out.println("Succcess");	
	}
}
