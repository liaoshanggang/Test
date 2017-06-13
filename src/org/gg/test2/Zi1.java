package org.gg.test2;

public class Zi1 extends Fu1{
	public Zi1(String name){
//		未定义隐式超构造函数 Fu1（）。必须显式调用另一个构造函数
//	当父类中没有空参数的构造函数时，子类的构造函数必须通过this或super语句指定要访问的构造函数
		super(name);
	}
	public Zi1(String name,String age){
//		子类的构造函数必须通过this
		this(name);
	}
}
