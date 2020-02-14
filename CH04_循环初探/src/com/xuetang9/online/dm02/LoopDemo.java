package com.xuetang9.online.dm02;

/**
 * 
 * @author hp
 *
 */
public class LoopDemo {
	public static void main(String[] args) {
		int i = 1;
		int j = 0;
		while (i <= 100) {
			System.out.print(j+=i);
			System.out.printf("当前打印第%d个\n", i);
			i++;
		}
		
	}
}
