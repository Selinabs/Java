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
			System.out.printf("��ǰ��ӡ��%d��\n", i);
			i++;
		}
		
	}
}
