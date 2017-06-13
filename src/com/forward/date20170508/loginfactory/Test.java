package com.forward.date20170508.loginfactory;

public class Test {

	public static void main(String[] args) {
		Factory factory = new Factory();
		
		Vehicle v = factory.produce("Car");
		v.show();
		
		v = factory.produce("Plane");
		v.show();
		
	}

}
