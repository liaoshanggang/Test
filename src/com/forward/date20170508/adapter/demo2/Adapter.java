package com.forward.date20170508.adapter.demo2;

public class Adapter implements Target{
	//����һ��Source������
	Source Source;
	
	
	
	public Adapter(Source source) {
		Source = source;
	}

	@Override
	public void targetMethod() {
		System.out.println("this is targetMethod()!");
	}

	@Override
	public void sourceMethod() {
		Source.sourceMethod();
	}
	
}
