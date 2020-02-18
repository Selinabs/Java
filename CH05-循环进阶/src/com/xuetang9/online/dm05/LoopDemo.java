package com.xuetang9.online.dm05;

import java.util.Scanner;

public class LoopDemo {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int guessPrice = 3000;
		int i = 0;
		for (;i<5;i++) {
			System.out.print("请第"+(i+1)+"次输入：");
			int price = inputScanner.nextInt();
			if (price<guessPrice) {
				System.out.print("小了");
			} else if(price>guessPrice) {
				System.out.print("大了");
			} else {
			break;
			}
		}
		if (i == 0) {
			System.out.print("恭喜你中了头奖：iPhone8s pulas pulas。");
		} else if (i == 1 || i == 2) {
			System.out.println("恭喜您中了华为荣耀手环。");
		} else if (i == 3) {
			System.out.println("恭喜您获得了小米蓝牙耳机青春版。");
		} else {
			System.out.print("五次机会全部用完，下次继续努力吧！");
		} 
		inputScanner.close();
	}
}
