package com.forward.date20170508.decorator;

public class Test {
	public static void main(String[] args) {
		Sourceable sourceable = new Decorator(new Source());
		sourceable.sourceMethod();
	}
}
