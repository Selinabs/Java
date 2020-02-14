package com.xuetang9.online.dm02;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入内力值：");
		int power = scanner.nextInt();
		if (0 < power && power <= 1000) {
			System.out.println("不堪一击");
		} else if (1000 < power && power <= 3000){
			System.out.println("毫不足虑");
		} else if (3000 < power && power <= 5000) {
			System.out.println("不足挂齿");
		}
		scanner.close();
	}
}





