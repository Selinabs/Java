/**
 * Title:ArrayDemo.java 
 * date:2020-02-19
 * author ��ĭ��
 */
package com.xuetang9.online.dm06;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Zi_Xuan
 *
 */
public class ArrayDemo {
	
	public static void main(String[] args) {
		
		//ȡ����������ַ���
				//����һ
				/*int start = 5;
				int end =15;
				int randomNum = start + ((int)(Math.random()*1000)) % (end -start);//
				Math.random()����0-1֮��һ�����С��*/
				
				//������
				/*int start = 5;
				int end = 15;
				Random random = new Random();//������������
				//System.out.println(random.nextInt(15));
				int randomNum = start+ random.nextInt(end - start);
				System.out.println(randomNum);*/
				
				//������
				/*int start = 5;
				int end = 15;
				//Random random = new Random();//������������
				//System.out.println(random.nextInt(15));
				int randomNum = start+ (int)(System.currentTimeMillis()%(end-start));//ȡ��ǰ������ĺ�����
				System.out.println(randomNum);*/
		Scanner input = new Scanner(System.in);
		int[] nums = {23,65,98,2,129,28,96};
		System.out.println("����ǰ������:");
		System.out.println(Arrays.toString(nums));//������ת�����ַ������
		
		for (int i =0;i<nums.length;i++) {
			int randomIndex = i + (int)(System.currentTimeMillis()%(nums.length-i));
			//�����㷨
			int temp = nums[i];
			nums[i] = nums[randomIndex];
			nums[randomIndex] = temp;
			
		}
		System.out.println("���Һ�����ݣ�");
		System.out.println(Arrays.toString(nums));
		input.close();
	}

}
