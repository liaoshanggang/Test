package com.gg.dm.singleton;

public class Test {
	public static void main(String[] args) {
		Singleton st = Singleton.getInstance();
		System.out.println(st);
		st = st.getInstance().getInstance();
		System.out.println(st);
	}
}
