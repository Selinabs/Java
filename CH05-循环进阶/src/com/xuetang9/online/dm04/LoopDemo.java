package com.xuetang9.online.dm04;

import java.util.Scanner;

public class LoopDemo {
	public static void main(String[] args) {
		Scanner inputScanner=new Scanner(System.in);
		int sum=0;
		for(;;) {
			System.out.print("请输入本次的个人贡献值：");
			int exp = inputScanner.nextInt();
			if (exp<0) {
				System.err.println("个人贡献值不能为负数，系统强制退出！");
				break;
			}
			sum += exp;
		}
		System.out.println(sum);
		inputScanner.close();
	}
}
