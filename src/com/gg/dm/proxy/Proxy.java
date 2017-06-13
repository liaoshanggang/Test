package com.gg.dm.proxy;

public class Proxy implements Sourceable{
	private Source source;
	
	public Proxy() {
		super();
		this.source = new Source();
	}
	@Override
	public void method() {
		// TODO �Զ����ɵķ������
		before();
		source.method();
		after();
	}
	private void after() {
		// TODO �Զ����ɵķ������
		System.out.println("after proxy");
	}
	private void before() {
		// TODO �Զ����ɵķ������
		System.out.println("before proxy");
	}

}
