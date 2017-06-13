package com.forward.date20170508.singleinstance.demo1;

public class CountClass {
	private static int count = 0;
	public CountClass() {
		count++;
		System.out.println("count:"+count);
	}
}
