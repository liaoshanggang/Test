package com.lanqiao.test3;
/*（一）、建立一个汽车Auto类，包括轮胎个数(tires)，汽车颜色(color)，车身重量(weight)、速度(speed)等成员变量，
 * 并通过不同的构造方法创建实例。至少要求：  汽车能够加速，减速，停车。
 * 
*/
public class Auto {
	int tires;//轮胎个数
	String color;//汽车颜色
	double weight;//车身重量
	int speed;//速度
	
	public Auto() {
		// TODO Auto-generated constructor stub
	}
	
	public Auto(int tires, String color, double weight, int speed) {
		this.tires = tires;
		this.color = color;
		this.weight = weight;
		this.speed = speed;
	}
	
	//加速
	public void speedUp() {
		speed++;
	}
	
	//减速
	public void speedDown() {
		speed--;
	}
	
	public void stop() {
		speed = 0;
	}
}
