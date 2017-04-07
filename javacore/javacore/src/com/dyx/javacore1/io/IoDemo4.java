package com.dyx.javacore1.io;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f1=new File("myfile.data");
			FileOutputStream fos=new FileOutputStream(f1);
//			FileOutputStream fos=new FileOutputStream("myfile.data");
			DataOutputStream dos=new DataOutputStream(fos);
			dos.writeUTF("罗斯福");
			dos.writeInt(30);
			dos.close();
			System.out.println("AbsoultePath:"+f1.getAbsolutePath());
			
		FileInputStream fis=new FileInputStream("myfile.data");
		DataInputStream dis=new DataInputStream(fis);
				System.out.println("name:"+dis.readUTF());
				System.out.println("name:"+dis.readInt());
				fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
