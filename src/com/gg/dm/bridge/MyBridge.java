package com.gg.dm.bridge;

public class MyBridge extends Bridge{
	public void method() {
		getSourceable().method();
	}
}
