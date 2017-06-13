package com.lanqiao.randomobject;

public class Panguin  extends Pet{
	String sex;
	
	public void print(){
		System.out.println("Panguin");
	}

	public Panguin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Panguin(String name,String sex) {
		super(name);
		// TODO Auto-generated constructor stub
		this.sex = sex;
	}
	
	
	
}
