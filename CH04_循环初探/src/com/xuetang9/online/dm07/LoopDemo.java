package com.xuetang9.online.dm07;

import java.util.Scanner;

/**
 * do_whileѭ����ʾʾ��
 * du_whileѭ�������������ִ��һ�Σ�
 * whileѭ�������ʼ����������һ�ζ�����ѭ��
 * @author Zi_Xuan
 *
 */
public class LoopDemo {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);//����ɨ��
		
		String nameString;//����Ҫ��ѭ������ʹ�õı�����������ѭ�����ⶨ��
		char isOK;//ѭ������,Ҫ������do_whileѭ�������ʹ��
		
		
		do {
			String titleString = "���뽭��";
			System.out.println("��ӭ�����Ͼ��������磬���������쵱�������Ŵ��������ɣ�");
			nameString = input.next();
			System.out.println("ͷ�Σ�"+titleString);
			System.out.println("���ţ�"+nameString);
			System.out.print(nameString+"�������������������𣿣�y/n��-");
			isOK = input.next().charAt(0);//ȡ��������ַ����ĵ�һ���ַ�
		}while(isOK == 'n');
		System.out.print(nameString+"�������뽭������С֮��������ɢ��");
		input.close();//�ر�ɨ�������ͷ���Դ	
	}
}
