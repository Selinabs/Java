package com.xuetang9.online.dm07;

import java.util.Scanner;

/**
 * do_while循环演示示例
 * du_while循环无论如何至少执行一次，
 * while循环如果初始条件不满足一次都不会循环
 * @author Zi_Xuan
 *
 */
public class LoopDemo {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);//输入扫描
		
		String nameString;//所有要在循环体外使用的变量，必须在循环体外定义
		char isOK;//循环变量,要定义在do_while循环外才能使用
		
		
		do {
			String titleString = "初入江湖";
			System.out.println("欢迎来到老九武侠世界，请大侠起个响当当的名号闯荡江湖吧：");
			nameString = input.next();
			System.out.println("头衔："+titleString);
			System.out.println("名号："+nameString);
			System.out.print(nameString+"大侠，满意您的名号吗？（y/n）-");
			isOK = input.next().charAt(0);//取出输入的字符串的第一个字符
		}while(isOK == 'n');
		System.out.print(nameString+"大侠重入江湖，宵小之辈速速退散！");
		input.close();//关闭扫描器，释放资源	
	}
}
