package com.lanqiao.test3;
/*��һ��������һ������Auto�࣬������̥����(tires)��������ɫ(color)����������(weight)���ٶ�(speed)�ȳ�Ա������
 * ��ͨ����ͬ�Ĺ��췽������ʵ��������Ҫ��  �����ܹ����٣����٣�ͣ����
 * 
*/
public class Auto {
	int tires;//��̥����
	String color;//������ɫ
	double weight;//��������
	int speed;//�ٶ�
	
	public Auto() {
		// TODO Auto-generated constructor stub
	}
	
	public Auto(int tires, String color, double weight, int speed) {
		this.tires = tires;
		this.color = color;
		this.weight = weight;
		this.speed = speed;
	}
	
	//����
	public void speedUp() {
		speed++;
	}
	
	//����
	public void speedDown() {
		speed--;
	}
	
	public void stop() {
		speed = 0;
	}
}
