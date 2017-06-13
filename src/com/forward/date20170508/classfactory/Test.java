package com.forward.date20170508.classfactory;

public class Test {
	public static void main(String[] args) {
		Factory f = new PlaneFactory();
		f.produce().show();
		
		f = new CarFactory();
		f.produce().show();
	}
}
