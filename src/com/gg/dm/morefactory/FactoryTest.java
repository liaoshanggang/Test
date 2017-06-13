package com.gg.dm.morefactory;

public class FactoryTest {
	public static void main(String[] args) {
		SendFactory sf = new SendFactory();
		sf.produceEmail().send();
		sf.produceSms().send();
	}
}
