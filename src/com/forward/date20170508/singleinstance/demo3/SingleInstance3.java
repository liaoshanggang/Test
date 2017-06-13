package com.forward.date20170508.singleinstance.demo3;

/**
 * @Description: 安全同步，因为我们只需要在创建类的时候进行同步，
 * 所以只要将创建和getInstance()分开，单独为创建加synchronized关键字
 * @author forward
 * @date 2017年5月9日 下午1:34:33
 * @version V2.0
 */
public class SingleInstance3 {
	private static SingleInstance3 instance = null;

	private SingleInstance3() {

	}

	public static synchronized void init() {
		if (instance == null) {
			instance = new SingleInstance3();
		}
	}

	public static SingleInstance3 getSingleInstance3() {
		if (instance == null) {
			init();
		}
		return instance;
	}
}
