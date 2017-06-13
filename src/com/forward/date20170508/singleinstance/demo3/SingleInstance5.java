package com.forward.date20170508.singleinstance.demo3;

/**
 * @Description: ��ȫͬ��,ʵ������ǣ�����ģʽʹ���ڲ�����ά��������ʵ�֣�
 * JVM�ڲ��Ļ����ܹ���֤��һ���౻���ص�ʱ��
 * �����ļ��ع������̻߳���ġ����������ǵ�һ�ε���getInstance��ʱ��
 * JVM�ܹ������Ǳ�֤instanceֻ������һ�Σ����һᱣ֤�Ѹ�ֵ��instance���ڴ��ʼ����ϣ�
 * @author forward
 * @date 2017��5��9�� ����1:34:33
 * @version V2.0
 */
public class SingleInstance5 {
	//˽�й��췽������ֹ��ʵ����
	private SingleInstance5() {
	}
	//�˴�ʹ��һ���ڲ�����ά������ 
	private static class SingleFactory{
		private static SingleInstance5 instance = new SingleInstance5();
	}
	//��ȡ����
	public static SingleInstance5 getSingleInstance5(){
		return SingleFactory.instance;
	}
	//����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� 
    public Object readResolve() {  
        return getSingleInstance5();  
    } 
}
