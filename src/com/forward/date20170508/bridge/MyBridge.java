package com.forward.date20170508.bridge;

public class MyBridge extends Bridge {
	@Override
	public void method() {	
		getSource().method();
	}
}
