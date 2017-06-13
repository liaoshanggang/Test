package com.lanqiao.date20170505.chengyuan;

public class Outer {
	static int a = 100;
	//成员内部类可以看成是一个普通的方法，平行的// 或成员变量或方法
	//内部类可以用public修饰，不仅一个
	public class Inner1{
		//1、成员内部类中不允许有任何静态的声明
		//static int b = 100;
		int b = 100;
	}
	public class Inner2{
		public void method(){
			//3、外部类名.this,内部类this引用
			Outer.this.a = 100;
		}
	}
	
	public void show(){
		//static int b = 100;
		//2、非静态方法可以直接创建成员内部类实例
		Inner1 in = new Inner1();
		in.b = 200;
	}
	
	public static void show1(){
		//static int b = 100;
		//4、静态方法访问内部类
		//外部类名.内部类名 对象名= new 外部类对象.new 内部类对象
		//=new 外部类名().new 内部类名();
		/*Outer.Inner1 in = new Outer().new Inner1();
		in.b = 200;*/
	}
	public static void main(String[] args) {
		//5、访问成员内部类的唯一途径就是通过外部类对象
		Outer.Inner1 in = new Outer().new Inner1();
	}
}
