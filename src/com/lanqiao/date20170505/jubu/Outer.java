package com.lanqiao.date20170505.jubu;

public class Outer {
	
	public void show(){
		int a = 100;//jdk1.6��jdk1.8�Զ�����
		//�ֲ��ڲ��࣬����Ȩ���൱�ֲ����ԣ���ǰ�ķ������棬���˷�����û���ˡ�
		class Inner2{
			int b = 100;//�ֲ�
			public void method(){
				//a = 100;1.8�����ı��Ͳ��ܸ�
				System.out.println("a="+a);//ֻ��ʹ�÷����µĳ���������ʹ�ñ���
				System.out.println("b="+b);
			}
		}
		new Inner2().method();;
	}
	public static void main(String[] args) {
		new Outer().show();
	}
}
