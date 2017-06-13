package com.gg.dm.morefactory;

public class SendFactory {
	public Sender produceEmail() {
		return new EmailSender();	
	}
	
	public Sender produceSms() { 
		return new SmsSender();	
	}
}
