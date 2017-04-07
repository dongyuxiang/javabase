package com.dyx.javacore1.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		FileInputStream fis =new FileInputStream("sun.jpg");
		FileOutputStream fos=new FileOutputStream("sunback.jpg");
		int  read =fis.read();
		while(read != -1){
			fos.write(read);
			read = fis.read();
		}
		fis.close();
		fos.close();
		System.out.println("Copy Success!");
	}catch(IOException e){
		e.printStackTrace();
		
	}
	}

}
