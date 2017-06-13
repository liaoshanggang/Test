package com.forward.date20170508.classfactory;

public class PlaneFactory implements Factory{

	@Override
	public Vehicle produce() {
		return new Plane();
	}

}
