package com.lanqiao.test4;
//3."Manager"��̳�"Employee"�࣬��һ��final��Ա����"vehicle"
public class Manager extends Employee{
	final int vehicle = 4;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, int age, char sex) {
		super(name, age, sex);
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, int age, char sex, double salary) {
		super(name, age, sex, salary);
		// TODO Auto-generated constructor stub
	}

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Manager play.........");
	}
	
	
	
}
