package com.xuetang9.online.dm04;

import java.util.Scanner;

public class LoopDemo {
	/**
	 *使用循环实现三次密码输入错误退出程序
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int password = 1234;
		int inputPassword;
		int i = 0;
		boolean j = true;
		while (j) {
			System.out.print("请输入密码：");
			inputPassword = input.nextInt();
			if (inputPassword == password) {
				System.out.println("登陆成功！");
				j = false;
				//break;
			} else {
				i++;
				if (i == 3) {
					System.err.println("输入错误3次，系统强制退出！！！");
					System.exit(1);
				}
			}
		}
		input.close();
		
	}
}
