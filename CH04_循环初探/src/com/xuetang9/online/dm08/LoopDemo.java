package com.xuetang9.online.dm08;

/**
 * ģ�������
 */

import java.util.Scanner;

public class LoopDemo {
	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		double operand1,operand2;//������1��������2
		String operator;
		char isContinue;
		
		do {
			System.out.println("������������������");
			while (!inputScanner.hasNextDouble()) {//�жϻ������������
				System.out.println("��������ݱ�����double���ͣ����������룡");
				inputScanner.next();//�����������
			}
			operand1 = inputScanner.nextDouble();
			operand2 = inputScanner.nextDouble();
			System.out.println("�������������");
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
				System.out.println("������������");
				break;
			}
			System.out.print("�Ƿ�������㣨y/n����");
			isContinue = inputScanner.next().charAt(0);
		} while(isContinue== 'y');
		System.out.println("��������������˳���");
		inputScanner.close();
	}
}
