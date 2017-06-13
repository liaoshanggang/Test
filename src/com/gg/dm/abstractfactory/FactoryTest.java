package com.gg.dm.abstractfactory;

public class FactoryTest {
	public static void main(String[] args) {
		new EmailSenderFactory().produce().send();
		new SmsSenderFactory().produce().send();
	}
}
