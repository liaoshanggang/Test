package com.gg.dm.synsingleton;

public class Singleton {
	private static Singleton instance;
	
	private Singleton()	{
	}
	
	public static synchronized Singleton getInstance1() {
		if (instance==null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public static Singleton getInstance2() {
		if (instance==null) {
			synchronized (instance) {
				instance = new Singleton();
			}
			
		}
		return instance;
	}	
}
