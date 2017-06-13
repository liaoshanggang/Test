package com.lanqiao2;

public class Test {
	public static void main(String[] args) {
		Manager manager = new Manager();
		//方法实现多态
		Fruit fruit = new Apple();
		manager.callEat(fruit);
		 fruit = new Banana();
		 manager.callEat(fruit);
		 fruit = new Orange();
		 manager.callEat(fruit);
		 
//		 //678步
//		 Fruit[] fruit1 = new Fruit[3];
//		 fruit1[0] = new Apple();
//		 fruit1[1] = new Banana();
//		 fruit1[2] = new Orange();
//		 for(int i=0;i<fruit1.length;i++){
//			 fruit1[i].eat();
//		 }
		 
//		manager.callEat(new Banana());
//		manager.callEat(new Orange());
//		manager.callEat(new Apple());
	}
}
