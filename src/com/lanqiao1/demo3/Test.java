package com.lanqiao1.demo3;


public class Test
{
	public static void main(String[] args)
	{
		Car c = new Car("红旗","红色",4);
		Truck v = new Truck("大力士","绿色",10.0f);
		c.showInfo();
		v.showTrck();
	}
}
