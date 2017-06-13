package com.forward.date20170508.singleinstance.demo3;
/**
 * @Description: ��ȫͬ��,���������ֽڶ����ϣ��������÷����������ϻ������½���
 * ��Ϊÿ�ε���getInstance()����Ҫ�Զ�������
 * @author forward
 * @date 2017��5��9�� ����1:34:33
 * @version V2.0
 */
public class SingleInstance1 {
	private static SingleInstance1 instance = null;
	
	private SingleInstance1(){
		
	}
	
	public synchronized SingleInstance1 getSingleInstance1(){
		if(instance==null){
			instance = new SingleInstance1();
		}
		return instance;
	}
}
