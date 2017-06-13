package com.lanqiao.date20170505.param;

public class Test {
	public static void main(String[] args) {
		new Hello().addListner(new InterListnner() {
			int a = 100;
			@Override
			public void show() {
				System.out.println(a);
				System.out.println("InterListnner 实现类方法show");
			}
		});
	}
}
