package com.gg.dm.singleton;

public class Singleton {
	//����˽�о�̬ʵ������ֹ�����ã���ֵΪnull��ʵ���ӳټ���
	private static Singleton instance = null;
	
	//˽�й��췽������ֹ��ʵ����
	private Singleton() {		
	}
	
	//��̬���̷���������ʵ��
	public static synchronized Singleton getInstance() {
		if (instance==null) {
			instance = new Singleton();
		}
		return instance;
	}
}
