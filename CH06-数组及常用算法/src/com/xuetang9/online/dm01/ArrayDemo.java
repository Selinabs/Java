/**
 * Title:ArrayDemo.java 
 * date:2020-02-19
 * author 夏沫、
 */
package com.xuetang9.online.dm01;

import java.util.Scanner;

/**
 * @author Zi_Xuan
 *
 */
public class ArrayDemo {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int N = 5;//定义常量用“final”关键字，常量一般都要大写
		//final int U = N;
		double[] scores;//定义一个double类型的数组
		scores=new double[N];//初始化数组(设定数组的长度)
		String[] sc;
		sc = new String[N];
		for (int i = 0;i<N;i++) {
			System.out.printf("请输入第%d门课程名称：",i+1);
			sc[i] = input.next();
			System.out.printf("请输入第%d门课的成绩：",i+1);
			scores[i] = input.nextDouble();
		}
		for (int i =0;i<scores.length;i++) {
			System.out.printf("第%d门课是%s,成绩是：%.2f\n",i+1,sc[i],scores[i]);
		}
		input.close();
	}

}
