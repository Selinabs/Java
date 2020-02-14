package com.xuetang9.online.dm08;

/**
 * 模拟计算器
 */

import java.util.Scanner;

public class LoopDemo {
	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		double operand1,operand2;//操作数1，操作数2
		String operator;
		char isContinue;
		
		do {
			System.out.println("请输入两个操作数：");
			while (!inputScanner.hasNextDouble()) {//判断缓存的输入数据
				System.out.println("输入的数据必须是double类型，请重新输入！");
				inputScanner.next();//清除缓存数据
			}
			operand1 = inputScanner.nextDouble();
			operand2 = inputScanner.nextDouble();
			System.out.println("请输入运算符：");
			operator = inputScanner.next();
			switch (operator) {
			case "+":
				System.out.printf("%.2f %s %.2f = %.2f\n",
						operand1,operator,operand2,(operand1+operand2));
				break;
			case "-":
				System.out.printf("%.2f %s %.2f = %.2f\n",
						operand1,operator,operand2,(operand1-operand2));
				break;
			case "*":
				System.out.printf("%.2f %s %.2f = %.2f\n",
						operand1,operator,operand2,(operand1*operand2));
				break;
			case "/":
				System.out.printf("%.2f %s %.2f = %.2f\n",
						operand1,operator,operand2,(operand1/operand2));
				break;
			case "%":
				System.out.printf("%.2f %s %.2f = %.2f\n",
						operand1,operator,operand2,(operand1%operand2));
				break;
			default :
				System.out.println("运算符输入错误！");
				break;
			}
			System.out.print("是否继续计算（y/n）：");
			isContinue = inputScanner.next().charAt(0);
		} while(isContinue== 'y');
		System.out.println("计算结束，程序退出。");
		inputScanner.close();
	}
}
