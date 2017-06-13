package com.gg.dm.interfaceadapter;

public class WrapperTest {
	public static void main(String[] args) {
		Wrapper w = new SourceSub1();
		w.method1();
		w.method2();
		w = new SourceSub2();
		w.method1();
		w.method2();
	}
}
