package com.lanqiao.test4;
/*2.��Role��������һ��"Employee"�࣬�������Role������г�Ա�����췽�����⣩��
����չ	salary��Ա������ͬʱ����һ����̬��Ա������ְ����ţ�ID������
ͬ��Ҫ�������������췽����Ҫ���ֳ�this��super�ļ����÷���
��Ҫ�󸲸�play()���������ṩһ��final sing()������*/
public class Employee extends Role{
	static int ID;
	
	protected double salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, int age, char sex) {
		super(name, age, sex);
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, char sex, double salary) {
		this(name, age, sex);
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Emploee play........");
	}
	
	public final void sing() {
		System.out.println("Emploee sing.......");
	}
	
	
}
