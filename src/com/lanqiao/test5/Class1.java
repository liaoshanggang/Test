package com.lanqiao.test5;

interface A {
	int x = 1;
	void showX();
}
interface B {
	int y = 2;
	void showY();
}
class InterfaceTest implements A, B {
	int z = 3;
	public void showX() {
		System.out.println("x=" + x);
	}
	public void showY() {
		System.out.println("y=" + y);
	}
	public void showMe() {
		System.out.println("z=" + (z + x + y));
	}
}
public class Class1 {
	public static void main(String[] args) {
		InterfaceTest myObject = new InterfaceTest();
		myObject.showX();
		myObject.showY();
		myObject.showMe();
	}
}
