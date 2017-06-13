package com.forward.date20170508.loginfactory;
/**
 * @Description: 工厂类
 * @author forward
 * @date 2017年5月9日 下午1:04:16
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
		//在逻辑上添加生产对象方法
		}
		return v;
	}
	
}
