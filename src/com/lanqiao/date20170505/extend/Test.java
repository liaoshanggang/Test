package com.lanqiao.date20170505.extend;

public class Test {
	public static void main(String[] args) {
		//��������
		Car car = new Car(){//��������￪ʼ
			@Override
			public void drive() {
				System.out.println("���");
			}
		};//�������
		car.drive();
	}
}
