package com.dyx.threadmaipiao;

 class MaiPiao implements Runnable{
	private  int num=100;   //票数
	private boolean piao=true;
	public void run(){
		sale();
	}
	public void sale(){
		while(piao){
			if (num>0){
				System.out.println(Thread.currentThread().getName()+"......"+num--);
			}else{
				break;
			}
		}
	}
}
public class MaiPiaoTest{
	public static void main(String[] args){
		MaiPiao m1= new MaiPiao();
		Thread t1=new Thread(m1,"小强");
		Thread t2=new Thread(m1,"旺财");
		Thread t3=new Thread(m1,"猪大肠");
		Thread t4=new Thread(m1,"老毕");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		/*MaiPiao t1=new MaiPiao();
		MaiPiao t2=new MaiPiao();   //利用继承的方法
		MaiPiao t3=new MaiPiao();
		MaiPiao t4=new MaiPiao();
		t1.start();
		t2.start();
		t3.start();
		t4.start();*/
	}
}
