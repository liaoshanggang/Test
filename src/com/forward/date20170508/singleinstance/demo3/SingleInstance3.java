package com.forward.date20170508.singleinstance.demo3;

/**
 * @Description: ��ȫͬ������Ϊ����ֻ��Ҫ�ڴ������ʱ�����ͬ����
 * ����ֻҪ��������getInstance()�ֿ�������Ϊ������synchronized�ؼ���
 * @author forward
 * @date 2017��5��9�� ����1:34:33
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
