package com.gg.dm.normalfactory;

public class FactoryTest {
	public static void main(String[] args) {
		SendFactory sf = new SendFactory();
		sf.produce("sms").send();
		sf.produce("email").send();
	}
}
