package com.forward.date20170508.decorator;

public class Decorator implements Sourceable{
	Source source;
	
	public Decorator(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void sourceMethod() {
		System.out.println("��װ��ǰ");
		source.sourceMethod();
		System.out.println("��װ�κ�");
	}

}
