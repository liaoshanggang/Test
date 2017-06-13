package com.lanqiao.test4;
/*2.从Role类派生出一个"Employee"类，该类具有Role类的所有成员（构造方法除外），
并扩展	salary成员变量，同时增加一个静态成员变量“职工编号（ID）”。
同样要有至少两个构造方法，要体现出this和super的几种用法，
还要求覆盖play()方法，并提供一个final sing()方法。*/
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
