package com.xuetang9.online.dm04;

import java.util.Scanner;

//import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		//�����·�������µ�����
		Scanner in = new Scanner(System.in);
		//������ر���
		int year;
		int month;
		int dayOfMonth = 0;
		
		//�������
		System.out.println("��������ݣ�");
		year = in.nextInt();
		//�����·�
		System.out.println("�������·ݣ�");
		month = in.nextInt();
		
		switch (month) {
		case 1:
			dayOfMonth = 31;
			break;
			
		case 2:
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				dayOfMonth = 29;
			} else {
				dayOfMonth = 28;
			}
			break;
		case 3:
			dayOfMonth = 31;
			break;
		case 4:
			dayOfMonth = 30;
			break;
		case 5:
			dayOfMonth = 31;
			break;
		case 6:
			dayOfMonth = 30;
			break;
		case 7:
			dayOfMonth = 31;
			break;
		case 8:
			dayOfMonth = 31;
			break;
		case 9:
			dayOfMonth = 30;
			break;
		case 10:
			dayOfMonth = 31;
			break;
		case 11:
			dayOfMonth = 30;
			break;
		case 12:
			dayOfMonth = 31;
			break;
		default:
			System.out.println("������󣬳�����ִ�У�");
			System.exit(1);
		}
		System.out.printf("%d��%d�·ݵ������ǣ�%d",year,month,dayOfMonth);
		in.close();
	}
}





