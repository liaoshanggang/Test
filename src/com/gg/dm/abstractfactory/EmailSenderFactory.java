package com.gg.dm.abstractfactory;

public class EmailSenderFactory implements Provider{

	@Override
	public Sender produce() {
		// TODO �Զ����ɵķ������
		return new EmailSender();
	}

}
