/**
 * Title:ArrayDemo.java 
 * date:2020-02-19
 * author ��ĭ��
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
			System.out.print("�����"+(i+1)+"�����ݣ�");
			nums[i] = input.nextInt();
		}
		//ͨ��ѭ������������ֵ����Сֵ
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
		//������ֵ����Сֵ
		System.out.print("����Ԫ��Ϊ��");
		for (int i =0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		System.out.printf("��������ֵΪ��%d,��СֵΪ��%d",max,min);
		input.close();
	}

}
