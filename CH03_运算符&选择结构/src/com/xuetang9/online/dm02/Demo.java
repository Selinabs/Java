package com.xuetang9.online.dm02;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������ֵ��");
		int power = scanner.nextInt();
		if (0 < power && power <= 1000) {
			System.out.println("����һ��");
		} else if (1000 < power && power <= 3000){
			System.out.println("��������");
		} else if (3000 < power && power <= 5000) {
			System.out.println("����ҳ�");
		}
		scanner.close();
	}
}





