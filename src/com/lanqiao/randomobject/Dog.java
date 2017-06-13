package com.lanqiao.randomobject;

public class Dog extends Pet{
	String strain;
	public Dog() {
		super();
	}
	public Dog(String name,String strain) {
		super(name);
		this.strain = strain;
	}
	
	public void print(){
		System.out.println("Dog");
	}
}
