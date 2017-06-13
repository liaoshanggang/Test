package com.lanqiao.inclass;

import java.awt.Rectangle;
import java.util.Scanner;

public class TestNumber{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1,num2;
		System.out.println("请输入num1:");
		num1 = in.nextInt();
		System.out.println("请输入num2:");
		num2 = in.nextInt();
		Number n = new Number(num1,num2);
		System.out.println("两数之加："+n.add());
		System.out.println("两数之减"+n.sub());
		System.err.println("两数之乘"+n.mul());
		System.out.println("两数之差"+n.div());
	}
}
