package com.lanqiao1.demo3;

public class Car extends Vehicle{
	int seats;//��λ
	public void showCar(){
		System.out.println("��ʾС��������Ϣ:�̱�:"+this.brand+" ��ɫ��"+this.color+" ��λ��"+this.seats);
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
