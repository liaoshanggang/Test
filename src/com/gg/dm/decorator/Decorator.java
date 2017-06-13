package com.gg.dm.decorator;

public class Decorator implements Sourceable{
	private Source source;

	public Decorator(Source source) {
		super();
		this.source = source;
	}
	
	@Override
	public void method() {
		// TODO �Զ����ɵķ������
		System.out.println("before decorator");
		source.method();
		System.out.println("after decorator");
	}

}
