package com.dyx.map;

import java.awt.event.MouseWheelEvent;
import java.util.Date;
public class MapTDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point<Integer> p=new Point<Integer>(20,30); 
		p.setX(p.getX()+123);
		p.showInfo();
		
		Point<Date> d=new Point<Date>();
		d.setX(new Date());
		d.setY(new Date(88888888));
		d.showInfo();
	}
}
 class Point<T>{
	private T x;
	private T y;
	public Point(){		
	}
	public Point(T x,T y){
		this.x=x;
		this.y=y;
	}
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	public void showInfo(){
		System.out.println("x="+x+"\ty="+y);
	}
}
