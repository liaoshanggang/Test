package com.forward.date20170508.singleinstance.demo3;

/**
 * @Description: ��ȫͬ����ֻ���ڵ�һ�δ��������ʱ����Ҫ������֮��Ͳ���Ҫ��
 * @author forward
 * @date 2017��5��9�� ����1:34:33
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
