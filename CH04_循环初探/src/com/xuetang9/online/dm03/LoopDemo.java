package com.xuetang9.online.dm03;

import java.util.Scanner;
/**
 * �������������������ÿλ����֮��
 * @author hp
 *
 */
public class LoopDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i, j=0,k;
		System.out.printf("�����룺");
		i = scanner.nextInt();
		while (i > 0) {
			//ȡģ����
			k = i%10;
			
			j += k;
			/*
			 * ѭ����������
			 * i��10ȡ��
			 */
			i /= 10;
		}
		System.out.printf("ÿλ����֮���ǣ�%d",j);
		scanner.close();
	}
}
