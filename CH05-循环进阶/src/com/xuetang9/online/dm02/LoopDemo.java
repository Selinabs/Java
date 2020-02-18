package com.xuetang9.online.dm02;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class LoopDemo {
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		int avg;
		int sum = 0;
		int porwer = 0;
		int n = 3;
		for (int i = 0;i<n;i++) {
			System.out.print("ÇëÊäÈëÕ½Á¦");
			sum = input.nextInt();
			porwer += sum;
		}
		System.out.print(( avg= porwer/n));
		input.close();
	}
}
