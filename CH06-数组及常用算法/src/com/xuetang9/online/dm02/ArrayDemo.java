/**
 * Title:ArrayDemo.java 
 * date:2020-02-19
 * author ��ĭ��
 */
package com.xuetang9.online.dm02;

import java.util.Scanner;

/**
 * @author Zi_Xuan
 *
 */
public class ArrayDemo {
	
	public static void main(String[] args) {
		final int N = 13;
		int[] nums= new int[N];
		int sum = 0;
		int avg;
		nums[0] = 0;
		nums[1] = 1;
		for (int i = 2;i<N;i++) {
			nums[i] = nums[i-1] + nums[i-2];
		}
		for (int i=0;i<N;i++) {
			System.out.print(nums[i]);
			if(i!=N-1) {
				System.out.print(",");
			}
			sum+= nums[i];//���
		}
		System.out.println();
		avg = sum / N;
		System.out.printf("���еĺ�Ϊ��%d,ƽ��ֵΪ��%d",sum,avg);
	}

}
