package com.dyx.enumdemo;

import lombok.Getter;
import lombok.Setter;
@Getter
public enum EnumDemo2 {
	MON(1,"星期一"),TUE(2,"星期二"),WED(3,"星期三"),THU(4,"星期四"),FRI(5,"星期五"),SAT(6,"星期六"),SUN(7,"星期天");
	@Setter		//setter不支持写在枚举上
	private int value;//成员变量
	@Setter
	public String week;
	private EnumDemo2(int value,String week){ //构造方法必须私有，因为枚举是给系统看的
		this.value =value;
		this.week=week;
	}
	public void print(){
		System.out.println("我是print方法打印的内容："+this.value+"----"+this.week);
	}
	public String getInfo(){
		return "EnumDemo3:"+this.value+"---"+this.week;
	}
}
