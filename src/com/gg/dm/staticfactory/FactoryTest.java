package com.gg.dm.staticfactory;

public class FactoryTest {
	public static void main(String[] args) {
		SendFactory.produceEmail().send();
		SendFactory.produceSms().send();
	}
}
