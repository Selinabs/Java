package com.xuetang9.online.dm06;

import java.util.Scanner;

public class LoopDemo {
	public static void main(String[] args) {
		Scanner inputScanner= new Scanner(System.in);
		int count = 0;
		int to_muny;
		for (int i=0;i<5;i++) {
			System.out.print("请输入玩家【"+(i+1)+"】的消费额：");
			to_muny = inputScanner.nextInt();
			if (to_muny>=500) {
				continue;
			} else {
				count++;
			}
		}
		System.out.print("消费额小于500的玩家个数："+count);
		inputScanner.close();
		
	}
}
