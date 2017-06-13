package com.lanqiao.date20170505.imp;

class Test{
	public static void main(String[] args) {
		Vehicle v =  new Vehicle() {
			@Override
			public void drive() {
				System.out.println("sdfsf");
			}
		};
		v.drive();
	}
}