package org.gg.test2;

public class Fu {
	public String name;
	void eat(){
		System.out.println("父吃");
	}
	static void run(){
		System.out.println("父跑");
	}
	void sleep(){
		System.out.println("父睡");
	}
	Fu(){
		System.out.println("Fu类无参构造函数");
	}
}
