package com.lanqiao1.demo3;

public class Truck extends Vehicle{
	float load;//����
	public void showTrck(){
		System.out.println("��ʾ��������Ϣ:�̱�"+this.brand+" ��ɫ��"+this.color+" ���أ�"+this.load);
	}
	public  Truck(){
		
	}
	public  Truck(String brand,String color,float load){
		super(brand,color);
		this.load = load;
	}
}
