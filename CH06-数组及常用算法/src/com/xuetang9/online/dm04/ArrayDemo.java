/**
 * Title:ArrayDemo.java 
 * date:2020-02-19
 * author ��ĭ��
 */
package com.xuetang9.online.dm04;

import java.util.Scanner;

/**
 * @author Zi_Xuan
 *��������������ż���ĸ���
 */
public class ArrayDemo {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int oddnum=0;
		int evennum=0;
		int[] nums= new int[6];
		for (int i =0;i<nums.length;i++) {
			System.out.print("������"+(i+1)+"����");
			nums[i]=input.nextInt();
		}
		for (int i = 0;i < nums.length;i++) {
			if (nums[i]%2==0) {
				oddnum++;
			} else {
				evennum++;
			}
		}
		System.out.printf("����������������ǣ�%d,ż������Ϊ��%d",evennum,oddnum);
		input.close();
	}

}
