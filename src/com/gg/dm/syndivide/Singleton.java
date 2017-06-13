package com.gg.dm.syndivide;

public class Singleton {
	private static Singleton instance = null;
	
	private Singleton() {
		
	}
	
	private static synchronized void synInit() {
		if (instance==null) {
			instance = new Singleton();
		}
	}
	
	public static Singleton getInstance() {
		if (instance==null) {
			synInit();
		}
		return instance;
	}
}
