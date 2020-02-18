package com.xuetang9.online.dm08;

import java.util.Scanner;

public class LoopDemo {
	/**
	 * 循环嵌套
	 * 用嵌套for循环输出菱形
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner inputScanner= new Scanner(System.in);
		
		System.out.print("请输入列数：");
		int raw = inputScanner.nextInt();
		int num=(raw-1)/2;
		for (int i = 0;i<=num;i++) {
			for (int j =0;j<=num-i-1;j++) {
				System.out.print(" ");
			}
			for (int j = 0;j<=2*i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0;i<=num-1;i++) {
			for (int j =0;j<=i;j++) {
				System.out.print(" ");
			}
			for (int j = 0;j<=(2*num-2)-2*i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		inputScanner.close();
		}
		
}
