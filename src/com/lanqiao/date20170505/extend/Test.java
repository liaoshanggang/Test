package com.lanqiao.date20170505.extend;

public class Test {
	public static void main(String[] args) {
		//父类名字
		Car car = new Car(){//自身从这里开始
			@Override
			public void drive() {
				System.out.println("你好");
			}
		};//这里结束
		car.drive();
	}
}
