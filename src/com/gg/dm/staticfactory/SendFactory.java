package com.gg.dm.staticfactory;

public class SendFactory {
	public static Sender produceEmail() {
		return new EmailSender();	
	}
	
	public static Sender produceSms() { 
		return new SmsSender();	
	}
}
