package com.gg.dm.classadapter;

public class AdapterTest {
	public static void main(String[] args) {
		Targetable t = new Adapter();
		t.method1();
		t.method2();
	}
}
