package com.lanqiao1.demo3;

public class Truck extends Vehicle{
	float load;//载重
	public void showTrck(){
		System.out.println("显示卡车的信息:商标"+this.brand+" 颜色："+this.color+" 载重："+this.load);
	}
	public  Truck(){
		
	}
	public  Truck(String brand,String color,float load){
		super(brand,color);
		this.load = load;
	}
}
