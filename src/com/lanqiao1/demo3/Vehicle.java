package com.lanqiao1.demo3;


public class Vehicle{
	String brand;//�̱�
	String color;//��ɫ
	public void run(){
		System.out.println("���Ѿ�������");
	}
	public void showInfo(){
		System.out.println("��ʾ������Ϣ���̱�"+brand+"����ɫ"+color);
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
