package com.gg.dm.objectdapter;

public class Wrapper implements Targetable{
	private Source source;
	
	public Wrapper(Source source) {
		super();
		this.source = source;
	}
	@Override
	public void method2() {
		// TODO �Զ����ɵķ������
		System.out.println("This is the targetable method!");
	}
	@Override
	public void method1() {
		// TODO �Զ����ɵķ������
		source.method1();
	}
}
