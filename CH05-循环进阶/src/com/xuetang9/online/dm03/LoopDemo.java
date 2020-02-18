package com.xuetang9.online.dm03;

public class LoopDemo {
	public static void main(String[] args) {
		int i = 0 ;
		System.out.println("周一\t周二\t周三\t周四\t周五\t周六\t周天");
		System.out.print("\t");
		for (;i<31;i++) {
			System.out.print(i+1 +"\t");

			if ((i+2)%7==0) {
				System.out.println();
			}
		}

	}
}
