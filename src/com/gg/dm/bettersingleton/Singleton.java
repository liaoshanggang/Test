package com.gg.dm.bettersingleton;

public class Singleton {
	private Singleton() {
	}
	
	private static class SingletonFactory {
		private static Singleton instance;
	}
	
	public static Singleton getInstance() {
		return SingletonFactory.instance;
	}
	
	public Object readResolve() {
		return getInstance();
	}
}
