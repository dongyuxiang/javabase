package com.dyx.enumdemo;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum EnumDemo1 {
	MON(1,"星期一"),TUE(2,"星期二"),WED(3,"星期三"),THU(4,"星期四"),FRI(5,"星期五"),SAT(6,"星期六"){
		@Override
		public boolean isRest(){
			return true;
		}
	},
	SUN(7,"星期天"){
		@Override
		public boolean isRest(){
			return true;
		}	
	};
	@Setter		//setter不支持写在枚举上
	private int value;//成员变量
	@Setter
	public String week;
	private EnumDemo1(int value,String week){ //构造方法必须私有，因为枚举是给系统看的
		this.value =value;
		this.week=week;
	}
	public int getValue(){//普通方法
		return value;
	}
	public boolean isRest() {
		// TODO Auto-generated method stub
		return false;
	}
}
