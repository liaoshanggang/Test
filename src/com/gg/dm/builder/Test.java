package com.gg.dm.builder;

public class Test {
	public static void main(String[] args) {
		Builder b = new Builder();
		b.produceMailSender(10);
		b.produceSmsSender(5);
	}
}
