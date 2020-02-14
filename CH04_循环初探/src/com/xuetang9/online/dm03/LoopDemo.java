package com.xuetang9.online.dm03;

import java.util.Scanner;
/**
 * 计算输入的整形数字中每位数字之和
 * @author hp
 *
 */
public class LoopDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i, j=0,k;
		System.out.printf("请输入：");
		i = scanner.nextInt();
		while (i > 0) {
			//取模运算
			k = i%10;
			
			j += k;
			/*
			 * 循环变量更新
			 * i对10取整
			 */
			i /= 10;
		}
		System.out.printf("每位数字之和是：%d",j);
		scanner.close();
	}
}
