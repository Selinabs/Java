/**
 * Title:ArrayDemo.java 
 * date:2020-02-19
 * author ��ĭ��
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
		System.out.print("��������Ҫ���ҵ����֣�");
		int num = input.nextInt();
		int findIndex = -1;//�ҵ����޸ģ�û�ҵ��Ͳ���
		for (int i=0;i < nums.length;i++) {
			if (nums[i]==num) {
				findIndex = i;
				break;
			}	
		}
		if (findIndex != -1) {
			System.out.printf("%d������nums�е��±�Ϊ%d",num,findIndex);
		} else {
			System.out.print(num+"�������в����ڡ�");
		}
		input.close();
	}

}
