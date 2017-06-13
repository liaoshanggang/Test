package com.gg.dm.proxy;

public class Proxy implements Sourceable{
	private Source source;
	
	public Proxy() {
		super();
		this.source = new Source();
	}
	@Override
	public void method() {
		// TODO 自动生成的方法存根
		before();
		source.method();
		after();
	}
	private void after() {
		// TODO 自动生成的方法存根
		System.out.println("after proxy");
	}
	private void before() {
		// TODO 自动生成的方法存根
		System.out.println("before proxy");
	}

}
