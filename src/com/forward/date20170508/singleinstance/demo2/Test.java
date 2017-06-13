package com.forward.date20170508.singleinstance.demo2;

public class Test {

	public static void main(String[] args) {
		SingleInstance instance = SingleInstance.getSingleInstance();
		instance.show();
		
		SingleInstance.getSingleInstance();
		SingleInstance.getSingleInstance();
	}

}
