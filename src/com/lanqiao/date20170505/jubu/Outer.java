package com.lanqiao.date20170505.jubu;

public class Outer {
	
	public void show(){
		int a = 100;//jdk1.6，jdk1.8自动加上
		//局部内部类，访问权限相当局部属性，当前的方法里面，出了方法就没用了。
		class Inner2{
			int b = 100;//局部
			public void method(){
				//a = 100;1.8常量改变后就不能改
				System.out.println("a="+a);//只能使用方法下的常量，不能使用变量
				System.out.println("b="+b);
			}
		}
		new Inner2().method();;
	}
	public static void main(String[] args) {
		new Outer().show();
	}
}
