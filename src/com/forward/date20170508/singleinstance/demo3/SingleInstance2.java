package com.forward.date20170508.singleinstance.demo3;

/**
 * @Description: 安全同步，只有在第一次创建对象的时候需要加锁，之后就不需要了
 * @author forward
 * @date 2017年5月9日 下午1:34:33
 * @version V2.0
 */
public class SingleInstance2 {
	private static SingleInstance2 instance = null;

	private SingleInstance2() {

	}

	public static SingleInstance2 getSingleInstance2() {
		if (instance == null) {
			synchronized (instance) {
				if (instance == null) {
					instance = new SingleInstance2();
				}
			}
		}
		return instance;
	}
}
