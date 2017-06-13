package org.gg.test2;

class Car//对
/*Car这类事物进行描述*/
{
	String color = "red";
	int num = 4;
	static boolean hasWheel = true;
	static String str = "静态成员变量";
	void show()
	{
		//this.show();//java.lang.StackOverflowError
		System.out.println("color="+color+"..num="+num);
	}
	static void method(){
		System.out.println("静态成员方法");
	}
	static void  notice(){
//		this.color;//错误
		//静态方法只能访问静态成员(成员变量和成员函数)
		method();
		str = "访问静态成员变量";
		
	}

}
class CarDemo
{
	public static void main(String[] args)
	{
		Car c = new Car();//建立对象
		c.color = "black";//对对象的属性进行修改
		c.show();//使用对象的功能。
//		匿名对象的两种使用方法
		//1、当对对象的方法仅进行一次调用时
		new Car().show();
		//2、匿名对象可以对实际参数进行传递
		show(new Car());
		Car c1 = new Car();
		Car c2 = new Car();
		//类名调用
		Car.hasWheel = false;
		//被所有对象所共享
		c1.hasWheel = true;
		c2.hasWheel = false;
		System.out.println("args:"+args);
		
	}
	public static void show(Car car){
		car.color = "blue";
		System.out.println("car.color:"+car.color);
	}
}