package com.xuetang9.online.dm04;

import java.util.Scanner;

//import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		//根据月份输出该月的天数
		Scanner in = new Scanner(System.in);
		//定义相关变量
		int year;
		int month;
		int dayOfMonth = 0;
		
		//输入年份
		System.out.println("请输入年份：");
		year = in.nextInt();
		//输入月份
		System.out.println("请输入月份：");
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
			System.out.println("输入错误，程序不能执行！");
			System.exit(1);
		}
		System.out.printf("%d年%d月份的天数是：%d",year,month,dayOfMonth);
		in.close();
	}
}





