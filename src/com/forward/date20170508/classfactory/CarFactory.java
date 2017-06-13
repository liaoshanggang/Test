package com.forward.date20170508.classfactory;

public class CarFactory implements Factory {
	
	@Override
	public Vehicle produce() {
		return new Car();
	}

}
