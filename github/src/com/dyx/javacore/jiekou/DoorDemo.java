package com.dyx.javacore.jiekou;

public class DoorDemo implements Idoor, Ilock, PaiZhao {
	@Override
	public void openDoor() {
		// TODO Auto-generated method stub
		System.out.println("用力推，门开了");
	}
	
	@Override
	public void closeDoor() {
		// TODO Auto-generated method stub
		System.out.println("轻轻拉门，门关上了");
	}
	@Override
	public void shangShuo() {
		// TODO Auto-generated method stub
		System.out.println("插进钥匙，想左旋转三圈，锁上了，拔出钥匙");
	}
	
	@Override
	public void openLock() {
		// TODO Auto-generated method stub
		System.out.println("插进钥匙，想右旋转三圈，锁打开了，拔出钥匙");
	}

	@Override
	public void takePhoto() {
		// TODO Auto-generated method stub
		System.out.println("玲…………咔擦…………照片以存储");
	}



}
