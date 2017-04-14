package com.dyx.zhujiedemo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SchoolDemo {
	private String claKind="高一";
	private Integer    claNo=02;
	private double  teacherNo=1003.3;
	public SchoolDemo(){
		
	}
	public SchoolDemo(String claKind){
		this.claKind=claKind;
	}
	public SchoolDemo(int claNo){
		this.claNo=claNo;	
	}
	public SchoolDemo(String claKind,int claNo){
		this.claKind=claKind;
		this.claNo=claNo;
	}
	public String show(){
		return "班级的类型为："+claKind+"("+claNo+"班)"+"老师编号："+teacherNo;
	}
}
