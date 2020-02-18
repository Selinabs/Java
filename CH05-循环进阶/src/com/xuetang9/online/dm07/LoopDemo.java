package com.xuetang9.online.dm07;

public class LoopDemo {
	public static void main(String[] args) {
		int sum=0;
		for (int i = 0;i < 100;i++) {
			if ((i+1)%2==0) {
				sum += (i+1);
			} else {
				continue;
			}
		}
		System.out.print("100以内的偶数和为："+sum);
		
	}
}
