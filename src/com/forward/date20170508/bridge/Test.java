package com.forward.date20170508.bridge;

public class Test {

	public static void main(String[] args) {
		Bridge bridge = new MyBridge();
		Source source = new SubSource1();
		bridge.setSource(source);
		bridge.method();
		
		source = new SubSource2();
		bridge.setSource(source);
		bridge.method();
	}

}
