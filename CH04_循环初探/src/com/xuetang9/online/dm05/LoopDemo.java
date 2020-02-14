package com.xuetang9.online.dm05;

public class LoopDemo {
	public static void main(String[] args) {
		int year = 2015;
		double volumeOfBusiness = 800;
		while (volumeOfBusiness <= 2000) {
			volumeOfBusiness = volumeOfBusiness+ volumeOfBusiness*0.25;
			year++;
		}
		System.out.printf("到"+year+"年，收入会达到"+volumeOfBusiness+"亿元");
	}
}
