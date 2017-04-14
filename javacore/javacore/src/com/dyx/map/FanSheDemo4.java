package com.dyx.map;

import java.lang.reflect.Constructor;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

import org.omg.IOP.Codec;

import com.dyx.iodemo.ioshilihuan.Person;

public class FanSheDemo4 {

	public static void main(String[] args) throws Exception {
//		Class c1=Class.forName("");
		Class c2=Person1.class;
		Constructor con=c2.getConstructor(String.class,int.class);
		Object obj=c2.newInstance();
	}
}