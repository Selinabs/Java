package com.xuetang9.online.dm05;

import java.util.Scanner;

public class LoopDemo {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int guessPrice = 3000;
		int i = 0;
		for (;i<5;i++) {
			System.out.print("���"+(i+1)+"�����룺");
			int price = inputScanner.nextInt();
			if (price<guessPrice) {
				System.out.print("С��");
			} else if(price>guessPrice) {
				System.out.print("����");
			} else {
			break;
			}
		}
		if (i == 0) {
			System.out.print("��ϲ������ͷ����iPhone8s pulas pulas��");
		} else if (i == 1 || i == 2) {
			System.out.println("��ϲ�����˻�Ϊ��ҫ�ֻ���");
		} else if (i == 3) {
			System.out.println("��ϲ�������С�����������ഺ�档");
		} else {
			System.out.print("��λ���ȫ�����꣬�´μ���Ŭ���ɣ�");
		} 
		inputScanner.close();
	}
}
