package com.forward.date20170508.methodfactory;

public class Test {
	public static void main(String[] args) {
		Factory f = new Factory();
		
		Car c = f.produceCar();
		c.show();
		
		Plane p = Factory.producePlane();
		p.show();
	}
}
