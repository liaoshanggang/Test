package com.gg.dm.abstractfactory;

public class SmsSenderFactory implements Provider {

	@Override
	public Sender produce() {
		// TODO 自动生成的方法存根
		return new SmsSender();
	}

}
