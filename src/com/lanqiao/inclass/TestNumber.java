package com.lanqiao.inclass;

import java.awt.Rectangle;
import java.util.Scanner;

public class TestNumber{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1,num2;
		System.out.println("������num1:");
		num1 = in.nextInt();
		System.out.println("������num2:");
		num2 = in.nextInt();
		Number n = new Number(num1,num2);
		System.out.println("����֮�ӣ�"+n.add());
		System.out.println("����֮��"+n.sub());
		System.err.println("����֮��"+n.mul());
		System.out.println("����֮��"+n.div());
	}
}
