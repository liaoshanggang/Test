package com.lanqiao1.demo4;

class A {
	int m = 1;
	double n = 2.0;

	void print() {
		System.out.println("Class A: m=" + m + "£¬n=" + n);
	}
}

class B extends A {
	float m = 3.0f;
	String n = "Good .";

	void print() {
		super.print();
		System.out.println("Class B: m=" + m + "£¬n=" + n);
	}

	public static void main(String[] args) {
		A a=new A();
		a.print();
//		B b=new B();
//		b.print();
	}
}