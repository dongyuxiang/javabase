package com.dyx.javacore1.ioshilihuan;

import java.io.Serializable;

public class Person implements Serializable {

	
		// TODO Auto-generated method stub
		private static final long serislVersionUID=1L;//私有化serislVersionUID的最终长度为1个long型
		private int personId;
		private String name;
//		private String pass;
		private transient String pass;
		public Person(){
		}
		public Person(int personId,String name,String pass){//生成参数个数为3的构造函数
			this.personId = personId;
			this.name=name;
			this.pass=pass;
		}
		public String toString(){
			return "person:"+personId+"\tname:"+name+"\tpass"+pass;//用toString方法返回结果
		
	}

}
