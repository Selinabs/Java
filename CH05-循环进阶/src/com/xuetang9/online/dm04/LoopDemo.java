package com.xuetang9.online.dm04;

import java.util.Scanner;

public class LoopDemo {
	public static void main(String[] args) {
		Scanner inputScanner=new Scanner(System.in);
		int sum=0;
		for(;;) {
			System.out.print("�����뱾�εĸ��˹���ֵ��");
			int exp = inputScanner.nextInt();
			if (exp<0) {
				System.err.println("���˹���ֵ����Ϊ������ϵͳǿ���˳���");
				break;
			}
			sum += exp;
		}
		System.out.println(sum);
		inputScanner.close();
	}
}
