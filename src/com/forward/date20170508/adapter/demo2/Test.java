package com.forward.date20170508.adapter.demo2;
//������
public class Test {
	public static void main(String[] args) {
		Target t = new Adapter(new Source());
		t.sourceMethod();
		t.targetMethod();
	}
}
