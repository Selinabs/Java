package com.xuetang9.online.dm05;

public class LoopDemo {
	public static void main(String[] args) {
		int year = 2015;
		double volumeOfBusiness = 800;
		while (volumeOfBusiness <= 2000) {
			volumeOfBusiness = volumeOfBusiness+ volumeOfBusiness*0.25;
			year++;
		}
		System.out.printf("��"+year+"�꣬�����ﵽ"+volumeOfBusiness+"��Ԫ");
	}
}
