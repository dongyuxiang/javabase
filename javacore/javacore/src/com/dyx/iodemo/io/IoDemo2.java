package com.dyx.iodemo.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IoDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		FileReader fr =new FileReader("myInfo.txt");
		FileWriter fw =new FileWriter("myInfoBack.txt");
		int read = fr.read();
		while(read != -1){
			fw.write(read);
			read = fr.read();
		}
		fr.close();
		fw.close();
		System.out.println("Copy Success!");
	}catch (IOException e) {
		// TODO: handle exception
		System.out.println(e);
		}
	}
}
