package com.gg.dm.decorator;

public class DecoratorTest {
	public static void main(String[] args) {
		Source source = new Source();
		Sourceable s = new Decorator(source);
		s.method();
	}
}
