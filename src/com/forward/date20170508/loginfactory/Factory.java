package com.forward.date20170508.loginfactory;
/**
 * @Description: ������
 * @author forward
 * @date 2017��5��9�� ����1:04:16
 * @version V2.0
 */
public class Factory {
	
	public Vehicle produce(String name){
		Vehicle v = null;
		switch (name) {
		case "Car":
			v = new Car();
			break;
		case "Plane":
			v = new Plane();
			break;
		//���߼�������������󷽷�
		}
		return v;
	}
	
}
