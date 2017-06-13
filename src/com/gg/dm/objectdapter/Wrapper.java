package com.gg.dm.objectdapter;

public class Wrapper implements Targetable{
	private Source source;
	
	public Wrapper(Source source) {
		super();
		this.source = source;
	}
	@Override
	public void method2() {
		// TODO 自动生成的方法存根
		System.out.println("This is the targetable method!");
	}
	@Override
	public void method1() {
		// TODO 自动生成的方法存根
		source.method1();
	}
}
