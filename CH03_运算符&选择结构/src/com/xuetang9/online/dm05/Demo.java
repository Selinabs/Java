package com.xuetang9.online.dm05;

import java.util.Scanner;

//import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		//����ɨ��
		Scanner in = new Scanner(System.in);
		
		System.out.println("��ѡ��1.��½��Ϸ\t2.�˳���Ϸ");
		int porint = in.nextInt();
		if (porint == 2) {
			System.out.println("�����˳���");
			System.exit(1);
		} else if (porint == 1) {
			System.out.println("��½�ɹ�");
			System.out.println("1.��������\n2.��Ŀ����\n3.�������\n4.��������\n5.�۲����\n6.����һ��");
			int porint1 = in.nextInt();
			switch (porint1) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				System.out.println("Ц���������������");
				System.out.println("1.��ʾ���к���\n2.��Ӻ���\n3.ɾ������\n4.�޸ĺ�����Ϣ\n5.���Һ���");
				break;
			case 4:
				
				break;
			case 5:
				System.out.println("Ц���������۲����");
				System.out.println("1.�鿴����\n2.�д�����\n3.��������̵�\n4.��˷����̵�\n5.��ֵ��Ԫ��");
				break;
			case 6:
				
				break;
			}
		}else {
			System.out.println("ѡ����󣡳����˳���");
			System.exit(1);
		}
		in.close();
	}
}





