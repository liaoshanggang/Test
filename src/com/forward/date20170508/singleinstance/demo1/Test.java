package com.forward.date20170508.singleinstance.demo1;

public class Test {

	public static void main(String[] args) {
		//����
		SingleInstance singleInstance = SingleInstance.getSingleInstance();
		singleInstance.show();
		singleInstance = SingleInstance.getSingleInstance();
		singleInstance.show();
		
		//����
		new CountClass();
		new CountClass();
		new CountClass();
	}

}
