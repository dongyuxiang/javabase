package com.dyx.iodemo.io;

import java.beans.beancontext.BeanContext;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IoDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader input = new FileReader("myInfo.txt");
			BufferedReader br=new BufferedReader(input);
			FileWriter output=new FileWriter("myInfoBack.txt");
			BufferedWriter bw=new BufferedWriter(output);
			String s=br.readLine();
			while(s!=null){
				bw.write(s);
				bw.newLine();
				s=br.readLine();
			}
			br.close();
			br.close();
			System.out.println("Copy Success!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
