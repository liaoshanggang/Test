package com.gg.dm.abstractfactory;

public class SmsSenderFactory implements Provider {

	@Override
	public Sender produce() {
		// TODO �Զ����ɵķ������
		return new SmsSender();
	}

}
