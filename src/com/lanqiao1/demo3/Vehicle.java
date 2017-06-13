package com.lanqiao1.demo3;


public class Vehicle{
	String brand;//商标
	String color;//颜色
	public void run(){
		System.out.println("我已经开动了");
	}
	public void showInfo(){
		System.out.println("显示车辆信息：商标"+brand+"和颜色"+color);
	}
	public Vehicle(){
		
	}
	public Vehicle(String brand,String color)
	{
		// TODO Auto-generated constructor stub
		this.brand = brand;
		this.color = color;
	}
	public String getBrand()
	{
		return brand;
	}
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	
}
