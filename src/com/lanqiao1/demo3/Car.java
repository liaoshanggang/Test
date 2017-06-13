package com.lanqiao1.demo3;

public class Car extends Vehicle{
	int seats;//座位
	public void showCar(){
		System.out.println("显示小汽车的信息:商标:"+this.brand+" 颜色："+this.color+" 座位："+this.seats);
	}
	public Car(){
		
	}
	public Car(String brand,String color,int seats){
		super(brand,color);
		this.seats = seats;
	}
	public int getSeats()
	{
		return seats;
	}
	public void setSeats(int seats)
	{
		this.seats = seats;
	}
	
}
