package com.dyx.iodemo.ioshilihuan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import org.omg.PortableInterceptor.ObjectIdHelper;

public class Readbject {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("person.object");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Person person1=(Person)ois.readObject();
		Person person2=(Person)ois.readObject();
		System.out.println(person2);
		System.out.println(person1);
		ois.close();
		
	}

}
