package com.gg.dm.normalfactory;

public class SendFactory {
	public Sender produce(String type) {
		switch (type) {
		case "email":
			return new EmailSender();
		case "sms":
			return new SmsSender();
		default:
			System.out.println("请输入正确的类型");
			return null;
		}
		
	}
}
