package org.gg.test2;

public class Zi extends Fu{
	public String name;
	/*覆盖时，子类方法权限一定要大于等于父类方法权限private错误*/
	void eat(){
		//当子父类同名成员的时候，可以用super进行区分
		super.eat();
		System.out.println("子吃");
	}
	/*
	 *静态只能覆盖静态
	 * static void sleep(){
		
	}*/
	static void run(){
		System.out.println("子跑");
	}
	Zi(){
		//子类要调用父类的构造函数时，可以使用super();语句
		super();
		System.out.println("子类无参构造函数");
	}
}
class Test{
	public static void main(String[] args) {
		Fu fu = new Fu();
		fu.eat();
		Zi zi = new Zi();
		zi.eat();
	}
}