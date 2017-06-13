package com.lanqiao1.demo2;

public class Student extends Person{
	String subject;
	Student(){
//		super();
	}
	Student(String name,int age,String subject){
		super(name,age);
		this.subject = subject;
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("学生姓名："+this.name+" 年龄："+this.age+" 科目:"+this.subject);
	}
	
}
