package com.lanqiao.date20170505.chengyuan;

public class Outer {
	static int a = 100;
	//��Ա�ڲ�����Կ�����һ����ͨ�ķ�����ƽ�е�// ���Ա�����򷽷�
	//�ڲ��������public���Σ�����һ��
	public class Inner1{
		//1����Ա�ڲ����в��������κξ�̬������
		//static int b = 100;
		int b = 100;
	}
	public class Inner2{
		public void method(){
			//3���ⲿ����.this,�ڲ���this����
			Outer.this.a = 100;
		}
	}
	
	public void show(){
		//static int b = 100;
		//2���Ǿ�̬��������ֱ�Ӵ�����Ա�ڲ���ʵ��
		Inner1 in = new Inner1();
		in.b = 200;
	}
	
	public static void show1(){
		//static int b = 100;
		//4����̬���������ڲ���
		//�ⲿ����.�ڲ����� ������= new �ⲿ�����.new �ڲ������
		//=new �ⲿ����().new �ڲ�����();
		/*Outer.Inner1 in = new Outer().new Inner1();
		in.b = 200;*/
	}
	public static void main(String[] args) {
		//5�����ʳ�Ա�ڲ����Ψһ;������ͨ���ⲿ�����
		Outer.Inner1 in = new Outer().new Inner1();
	}
}
