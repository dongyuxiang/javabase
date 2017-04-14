package com.dyx.zhujiedemo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClassDemo extends SchoolDemo{
	@Classno("高一")
	private String claKind="高二";
	@Default1("13")
	private Integer claNo=03;
	@Default1("1002.16")
	private double teacherNo=1003.3;
	public ClassDemo() {
		super();
	}
	public ClassDemo(int claNo) {
		super(claNo);
	}
	public ClassDemo(String claKind, int claNo) {
		super(claKind, claNo);
	}
	public ClassDemo(String claKind) {
		super(claKind);
	}
	public String show(){
		return "班级的类型为："+claKind+"("+claNo+"班)"+"\t老师编号："+teacherNo;
	}
	
}
