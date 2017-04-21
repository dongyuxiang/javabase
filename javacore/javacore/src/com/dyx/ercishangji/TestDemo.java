package com.dyx.ercishangji;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import com.dyx.javacore.yunsuanfu.ForDemo;

public class TestDemo {
	/*
	 * 打印乘法口诀表到文件中。 要求： A.创建一个普通类，类里有一个普通的方法，打印乘法口诀表的方法；
	 * B.在另一个测试类中，创建一个实现Runnable接口的线程； C.在run()方法中，使用反射唤醒打印乘法口诀表的方法；
	 * D.启动线程，打印乘法口诀表到文件中！
	 */
	public static void main(String[] args) throws IOException {
		ChenFaBiao c = new ChenFaBiao();
		c.chenFaBiao();
	}
}

class ChenFaBiao {
	public void chenFaBiao() throws IOException {
		PrintStream ps = new PrintStream("E:\\乘法表.txt");
		// FileOutputStream fw= new FileOutputStream("E:\\乘法表.txt");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				// FileWriter fw=new FileWriter("E:\\乘法表.txt");
				ps.print(j + "*" + i + "=" + j * i + "\t");
			}
			ps.println();
		}
	}
}
