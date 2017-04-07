package com.dyx.map;

import java.time.format.TextStyle;

import javax.swing.table.TableStringConverter;

public class MapTDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapTDemo2 m=new MapTDemo2();
		String valid1=m.evaluate("wangcai","wangcai");
		Integer valid2=m.evaluate(new Integer(300), new Integer(350));
		System.out.println(valid1);
		System.out.println(valid2);
	}
	public <T>T evaluate(T a,T b){
		if(a.equals(b)){
			return a;
		}else{
			return null;
		}
	}
}
