package com.lanqiao1.demo4;

class Parent {
	void printMe() {
		System.out.println("parent");
	}
}

class Child extends Parent {
	void printMe() {
		System.out.println("child");
	}
	void printAll() {
		super.printMe();
		this.printMe();
		printMe();
	}
}
class Class1 {
	public static void main(String[] args) {
		Child myC = new Child();
		myC.printAll();
	}
}