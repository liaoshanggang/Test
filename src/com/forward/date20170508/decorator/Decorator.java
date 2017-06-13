package com.forward.date20170508.decorator;

public class Decorator implements Sourceable{
	Source source;
	
	public Decorator(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void sourceMethod() {
		System.out.println("在装饰前");
		source.sourceMethod();
		System.out.println("在装饰后");
	}

}
