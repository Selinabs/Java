/**
 * Title:ArrayDemo.java 
 * date:2020-02-19
 * author ��ĭ��
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
		final int N = 5;//���峣���á�final���ؼ��֣�����һ�㶼Ҫ��д
		//final int U = N;
		double[] scores;//����һ��double���͵�����
		scores=new double[N];//��ʼ������(�趨����ĳ���)
		String[] sc;
		sc = new String[N];
		for (int i = 0;i<N;i++) {
			System.out.printf("�������%d�ſγ����ƣ�",i+1);
			sc[i] = input.next();
			System.out.printf("�������%d�ſεĳɼ���",i+1);
			scores[i] = input.nextDouble();
		}
		for (int i =0;i<scores.length;i++) {
			System.out.printf("��%d�ſ���%s,�ɼ��ǣ�%.2f\n",i+1,sc[i],scores[i]);
		}
		input.close();
	}

}
