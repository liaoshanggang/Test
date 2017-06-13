package com.gg.dm.objectdapter;

public class AdapterTest {
	public static void main(String[] args) {
		Targetable t = new Wrapper(new Source());
		t.method1();
		t.method2();
	}
}
