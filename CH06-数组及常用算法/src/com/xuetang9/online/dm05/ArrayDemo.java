/**
 * Title:ArrayDemo.java 
 * date:2020-02-19
 * author 夏沫、
 */
package com.xuetang9.online.dm05;

import java.util.Scanner;

/**
 * @author Zi_Xuan
 *
 */
public class ArrayDemo {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = {23,65,98,2,129,28,96};
		System.out.print("请输入您要查找的数字：");
		int num = input.nextInt();
		int findIndex = -1;//找到就修改，没找到就不改
		for (int i=0;i < nums.length;i++) {
			if (nums[i]==num) {
				findIndex = i;
				break;
			}	
		}
		if (findIndex != -1) {
			System.out.printf("%d在数组nums中的下标为%d",num,findIndex);
		} else {
			System.out.print(num+"在数组中不存在。");
		}
		input.close();
	}

}
