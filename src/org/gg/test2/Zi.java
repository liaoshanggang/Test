package org.gg.test2;

public class Zi extends Fu{
	public String name;
	/*����ʱ�����෽��Ȩ��һ��Ҫ���ڵ��ڸ��෽��Ȩ��private����*/
	void eat(){
		//���Ӹ���ͬ����Ա��ʱ�򣬿�����super��������
		super.eat();
		System.out.println("�ӳ�");
	}
	/*
	 *��ֻ̬�ܸ��Ǿ�̬
	 * static void sleep(){
		
	}*/
	static void run(){
		System.out.println("����");
	}
	Zi(){
		//����Ҫ���ø���Ĺ��캯��ʱ������ʹ��super();���
		super();
		System.out.println("�����޲ι��캯��");
	}
}
class Test{
	public static void main(String[] args) {
		Fu fu = new Fu();
		fu.eat();
		Zi zi = new Zi();
		zi.eat();
	}
}