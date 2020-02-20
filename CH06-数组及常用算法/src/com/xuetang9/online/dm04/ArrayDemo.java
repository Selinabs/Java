/**
 * Title:ArrayDemo.java 
 * date:2020-02-19
 * author 夏沫、
 */
package com.xuetang9.online.dm04;

import java.util.Scanner;

/**
 * @author Zi_Xuan
 *求数组中奇数和偶数的个数
 */
public class ArrayDemo {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int oddnum=0;
		int evennum=0;
		int[] nums= new int[6];
		for (int i =0;i<nums.length;i++) {
			System.out.print("请输入"+(i+1)+"个数");
			nums[i]=input.nextInt();
		}
		for (int i = 0;i < nums.length;i++) {
			if (nums[i]%2==0) {
				oddnum++;
			} else {
				evennum++;
			}
		}
		System.out.printf("该数组的奇数个数是：%d,偶数个数为：%d",evennum,oddnum);
		input.close();
	}

}
