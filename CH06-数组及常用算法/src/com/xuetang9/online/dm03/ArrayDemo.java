/**
 * Title:ArrayDemo.java 
 * date:2020-02-19
 * author 夏沫、
 */
package com.xuetang9.online.dm03;

import java.awt.font.NumericShaper;
import java.util.Scanner;

/**
 * @author Zi_Xuan
 *
 */
public class ArrayDemo {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = new int[5];
		for (int i =0;i<nums.length;i++) {
			System.out.print("输入第"+(i+1)+"个数据：");
			nums[i] = input.nextInt();
		}
		//通过循环求数组的最大值和最小值
		int max = nums[0];
		int min = nums[0];
		for (int i =0;i<nums.length;i++) {
			if (nums[i]>max) {
				max = nums[i];
			}
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		//输出最大值和最小值
		System.out.print("数组元素为：");
		for (int i =0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		System.out.printf("数组的最大值为：%d,最小值为：%d",max,min);
		input.close();
	}

}
