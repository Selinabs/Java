package com.xuetang9.online.dm04;

import java.util.Scanner;

public class LoopDemo {
	/**
	 *ʹ��ѭ��ʵ������������������˳�����
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int password = 1234;
		int inputPassword;
		int i = 0;
		boolean j = true;
		while (j) {
			System.out.print("���������룺");
			inputPassword = input.nextInt();
			if (inputPassword == password) {
				System.out.println("��½�ɹ���");
				j = false;
				//break;
			} else {
				i++;
				if (i == 3) {
					System.err.println("�������3�Σ�ϵͳǿ���˳�������");
					System.exit(1);
				}
			}
		}
		input.close();
		
	}
}
