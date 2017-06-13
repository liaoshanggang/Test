package com.forward.date20170508.methodfactory;

public class Factory {
	public Car produceCar() {
		return new Car();
	}

	public static Plane producePlane() {
		return new Plane();
	}
	
	//在方法级别上添加生产对象方法
}
