package com.forward.date20170508.singleinstance.demo3;

/**
 * @Description: ��ȫͬ��
 * @author forward
 * @date 2017��5��9�� ����1:34:33
 * @version V2.0
 */
public class SingleInstance6 {
	
	private static SingleInstance6 instance = new SingleInstance6();
	
	private SingleInstance6() {
	}
	
	public static SingleInstance6 getSingleInstance6(){
		return SingleInstance6.instance;
	}
}
