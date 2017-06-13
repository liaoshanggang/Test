package com.lanqiao.randomobject;

public class Manager {
	public void oper(Pet[] pet){
		for (int i = 0; i < pet.length; i++) {
			pet[i].print();
		}
	}
}
