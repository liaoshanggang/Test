package com.lanqiao1.demo2;

public class Teacher extends Person{
	double sal;
	Teacher(){
		
	}
	Teacher(String name,int age,double sal){
		super(name,age);
		this.sal = sal;
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("老师自我介绍");
	}
	
}
