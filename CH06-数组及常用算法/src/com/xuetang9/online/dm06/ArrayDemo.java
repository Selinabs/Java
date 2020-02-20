/**
 * Title:ArrayDemo.java 
 * date:2020-02-19
 * author 夏沫、
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
		
		//取随机数的三种方法
				//方案一
				/*int start = 5;
				int end =15;
				int randomNum = start + ((int)(Math.random()*1000)) % (end -start);//
				Math.random()返回0-1之间一个随机小数*/
				
				//方案二
				/*int start = 5;
				int end = 15;
				Random random = new Random();//创建随机类对象
				//System.out.println(random.nextInt(15));
				int randomNum = start+ random.nextInt(end - start);
				System.out.println(randomNum);*/
				
				//方案三
				/*int start = 5;
				int end = 15;
				//Random random = new Random();//创建随机类对象
				//System.out.println(random.nextInt(15));
				int randomNum = start+ (int)(System.currentTimeMillis()%(end-start));//取当前计算机的毫秒数
				System.out.println(randomNum);*/
		Scanner input = new Scanner(System.in);
		int[] nums = {23,65,98,2,129,28,96};
		System.out.println("打乱前的数组:");
		System.out.println(Arrays.toString(nums));//将数组转换成字符串输出
		
		for (int i =0;i<nums.length;i++) {
			int randomIndex = i + (int)(System.currentTimeMillis()%(nums.length-i));
			//交换算法
			int temp = nums[i];
			nums[i] = nums[randomIndex];
			nums[randomIndex] = temp;
			
		}
		System.out.println("打乱后的数据：");
		System.out.println(Arrays.toString(nums));
		input.close();
	}

}
