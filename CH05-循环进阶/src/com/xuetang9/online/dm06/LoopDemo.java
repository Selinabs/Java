package com.xuetang9.online.dm06;

import java.util.Scanner;

public class LoopDemo {
	public static void main(String[] args) {
		Scanner inputScanner= new Scanner(System.in);
		int count = 0;
		int to_muny;
		for (int i=0;i<5;i++) {
			System.out.print("��������ҡ�"+(i+1)+"�������Ѷ");
			to_muny = inputScanner.nextInt();
			if (to_muny>=500) {
				continue;
			} else {
				count++;
			}
		}
		System.out.print("���Ѷ�С��500����Ҹ�����"+count);
		inputScanner.close();
		
	}
}
