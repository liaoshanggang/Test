package com.gg.dm.singleton;

public class Singleton {
	//持有私有静态实例，防止被引用，赋值为null，实现延迟加载
	private static Singleton instance = null;
	
	//私有构造方法，防止被实例化
	private Singleton() {		
	}
	
	//静态工程方法，创建实例
	public static synchronized Singleton getInstance() {
		if (instance==null) {
			instance = new Singleton();
		}
		return instance;
	}
}
