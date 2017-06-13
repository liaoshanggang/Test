package com.forward.date20170508.singleinstance.demo1;

public class Test {

	public static void main(String[] args) {
		//µ¥Àý
		SingleInstance singleInstance = SingleInstance.getSingleInstance();
		singleInstance.show();
		singleInstance = SingleInstance.getSingleInstance();
		singleInstance.show();
		
		//¶àÀý
		new CountClass();
		new CountClass();
		new CountClass();
	}

}
