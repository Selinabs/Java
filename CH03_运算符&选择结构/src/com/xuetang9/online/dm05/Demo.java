package com.xuetang9.online.dm05;

import java.util.Scanner;

//import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		//输入扫描
		Scanner in = new Scanner(System.in);
		
		System.out.println("请选择：1.登陆游戏\t2.退出游戏");
		int porint = in.nextInt();
		if (porint == 2) {
			System.out.println("程序退出！");
			System.exit(1);
		} else if (porint == 1) {
			System.out.println("登陆成功");
			System.out.println("1.传音入密\n2.举目四望\n3.会会老友\n4.自我欣赏\n5.观察地形\n6.到此一游");
			int porint1 = in.nextInt();
			switch (porint1) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				System.out.println("笑傲江湖》会会老友");
				System.out.println("1.显示所有好友\n2.添加好友\n3.删除好友\n4.修改好友信息\n5.查找好友");
				break;
			case 4:
				
				break;
			case 5:
				System.out.println("笑傲江湖》观察地形");
				System.out.println("1.查看敌情\n2.切磋武艺\n3.浏览武器商店\n4.光顾防具商店\n5.充值送元宝");
				break;
			case 6:
				
				break;
			}
		}else {
			System.out.println("选择错误！程序退出。");
			System.exit(1);
		}
		in.close();
	}
}





